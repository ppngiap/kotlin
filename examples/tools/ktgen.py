import sys
import os
import stat


def mkdir_if_need_to(dir):
    if not os.path.isdir(dir):
        os.mkdir(dir)

def gen_file_if_need_to(dirname, name):
    filepath = os.path.join(dirname, name + ".kt");
    if not os.path.isfile(filepath):
        f = open(filepath, "w")

def gen_compile_if_need_to(dirname, name):
    filepath = os.path.join(dirname, "compile")
    if not os.path.isfile(filepath):
        f = open(filepath, "w")
        f.write("kotlinc ./%s.kt -d %s.jar\n" % (name, name))
        f.close()
    os.chmod(filepath, stat.S_IRUSR | stat.S_IWUSR | stat.S_IEXEC)

def gen_run_if_need_to(dirname, name):
    filepath = os.path.join(dirname, "run")
    if not os.path.isfile(filepath):
        f = open(filepath, "w")
        f.write("kotlin -classpath ./%s.jar %sKt\n" % (name, name))
        f.close()
    os.chmod(filepath, stat.S_IRUSR | stat.S_IWUSR | stat.S_IEXEC)


def main():
    name = sys.argv[1]
    dirname = name.lower()
    mkdir_if_need_to(dirname)
    gen_file_if_need_to(dirname, name)
    gen_compile_if_need_to(dirname, name)
    gen_run_if_need_to(dirname, name);


if __name__ == "__main__":
    main()