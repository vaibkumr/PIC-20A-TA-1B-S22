
source = "Indentation.java"
target = ".".join(source.split(".")[:-1])+"_evil.java"

with open(source, "r") as handle:
    lines = handle.readlines()

data = "".join([line.replace("\n", "").strip() for line in lines])
data = f"//This code is the evil version of {source}\n"+data

with open(target, "w+") as handle:
    handle.write(data)