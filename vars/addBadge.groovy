#!/usr/bin/env groovy

def call() {
 addBadge icon: 'folder.gif', id: '', link: 'https://github.com/Ganter123/library.git', text: 'scm'
 addShortText background: '', borderColor: '', color: 'blue', link: 'https://github.com/Ganter123/library.git', text: '${GIT_AUTHOR_NAME}'
}
