// See the Electron documentation for details on how to use preload scripts:
// https://www.electronjs.org/docs/latest/tutorial/process-model#preload-scripts

const { contextBridge, ipcRenderer } = require('electron')

contextBridge.exposeInMainWorld('electronAPI', {
    setTextValue: (textValue) => ipcRenderer.send('set-text', textValue),
    executeFile: (go) => ipcRenderer.send('python-script', go)
})