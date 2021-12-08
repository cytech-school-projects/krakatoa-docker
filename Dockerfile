# syntax=docker/dockerfile:1

FROM ubuntu:18.04

RUN apt update && apt install -y why && why3 config

WORKDIR /data
COPY ./src/*.java .
CMD krakatoa $(echo *.java)
