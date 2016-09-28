#!/bin/bash

gfsh <<EOF
connect --locator=localhost[10334];
list members;
list regions;
exit;
EOF