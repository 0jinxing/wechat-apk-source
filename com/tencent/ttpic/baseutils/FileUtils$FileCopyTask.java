package com.tencent.ttpic.baseutils;

import android.os.AsyncTask;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.InputStream;

class FileUtils$FileCopyTask extends AsyncTask<String, String, Boolean>
{
  String mDestPath;
  FileUtils.OnFileCopyListener mListener;
  InputStream mSrcInputStream;

  FileUtils$FileCopyTask(InputStream paramInputStream, String paramString)
  {
    this.mSrcInputStream = paramInputStream;
    this.mDestPath = paramString;
  }

  protected Boolean doInBackground(String[] paramArrayOfString)
  {
    AppMethodBeat.i(49674);
    boolean bool = FileUtils.copyFile(this.mSrcInputStream, this.mDestPath);
    AppMethodBeat.o(49674);
    return Boolean.valueOf(bool);
  }

  protected void onPostExecute(Boolean paramBoolean)
  {
    AppMethodBeat.i(49675);
    super.onPostExecute(paramBoolean);
    if (this.mListener != null)
      if (paramBoolean.booleanValue())
      {
        this.mListener.onCopySuccess();
        AppMethodBeat.o(49675);
      }
    while (true)
    {
      return;
      this.mListener.onCopyFailed();
      AppMethodBeat.o(49675);
    }
  }

  protected void onPreExecute()
  {
    AppMethodBeat.i(49673);
    super.onPreExecute();
    if (this.mListener != null)
      this.mListener.onCopyStart();
    AppMethodBeat.o(49673);
  }

  public void setOnFileCopyListener(FileUtils.OnFileCopyListener paramOnFileCopyListener)
  {
    this.mListener = paramOnFileCopyListener;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.baseutils.FileUtils.FileCopyTask
 * JD-Core Version:    0.6.2
 */