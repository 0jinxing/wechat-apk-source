package com.tencent.tmassistantsdk.storage;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.tmassistantsdk.util.GlobalUtil;
import com.tencent.tmassistantsdk.util.TMLog;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.InvalidParameterException;

public class TMAssistantFile
{
  protected static final int DataBufferMaxLen = 16384;
  protected static final String TAG = "TMAssistantFile";
  protected int mDataBufferDataLen;
  protected long mFileDataLen;
  protected FileOutputStream mFileOutputStream;
  protected String mFinalFileName;
  protected String mTempFileName;
  protected byte[] mWriteDataBuffer;

  public TMAssistantFile(String paramString1, String paramString2)
  {
    AppMethodBeat.i(76168);
    this.mTempFileName = null;
    this.mFinalFileName = null;
    this.mFileOutputStream = null;
    this.mWriteDataBuffer = null;
    this.mFileDataLen = 0L;
    this.mDataBufferDataLen = 0;
    this.mTempFileName = paramString1;
    this.mFinalFileName = paramString2;
    this.mFileDataLen = length();
    TMLog.i("TMAssistantFile", "mFileDataLen = " + this.mFileDataLen);
    AppMethodBeat.o(76168);
  }

  public static String getSaveFilePath(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(76175);
    if (paramString == null)
    {
      AppMethodBeat.o(76175);
      paramString = localObject;
    }
    while (true)
    {
      return paramString;
      String str = getSavePathRootDir();
      if (str == null)
      {
        AppMethodBeat.o(76175);
        paramString = localObject;
      }
      else
      {
        paramString = str + File.separator + paramString;
        AppMethodBeat.o(76175);
      }
    }
  }

  public static String getSavePathRootDir()
  {
    AppMethodBeat.i(76177);
    Object localObject = GlobalUtil.getInstance().getContext();
    if (localObject == null)
    {
      localObject = null;
      AppMethodBeat.o(76177);
      return localObject;
    }
    if (isSDCardExistAndCanWrite())
      localObject = "/tencent/TMAssistantSDK/Download/".concat(String.valueOf(((Context)localObject).getPackageName()));
    for (localObject = Environment.getExternalStorageDirectory().getAbsolutePath() + (String)localObject; ; localObject = ((Context)localObject).getFilesDir().getAbsolutePath() + "/TMAssistantSDK/Download")
    {
      AppMethodBeat.o(76177);
      break;
    }
  }

  public static boolean isSDCardExistAndCanWrite()
  {
    AppMethodBeat.i(76179);
    boolean bool;
    if (("mounted".equals(Environment.getExternalStorageState())) && (Environment.getExternalStorageDirectory().canWrite()))
    {
      bool = true;
      AppMethodBeat.o(76179);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(76179);
    }
  }

  private boolean moveFileFromTmpToSavaPath(String paramString1, String paramString2)
  {
    AppMethodBeat.i(76181);
    TMLog.i("TMAssistantFile", "moveFileFromTmpToSavaPath, tmpFilePath = " + paramString1 + ", saveFilePath = " + paramString2);
    boolean bool;
    if ((paramString1 != null) && (paramString2 != null))
    {
      paramString1 = new File(paramString1);
      if (paramString1.exists() == true)
      {
        bool = paramString1.renameTo(new File(paramString2));
        if (bool)
          GlobalUtil.updateFilePathAuthorized(paramString2);
        AppMethodBeat.o(76181);
      }
    }
    while (true)
    {
      return bool;
      TMLog.w("TMAssistantFile", "moveFileFromTmpToSavaPath failed ");
      bool = false;
      AppMethodBeat.o(76181);
    }
  }

  private boolean writeData(FileOutputStream paramFileOutputStream, byte[] paramArrayOfByte, int paramInt1, int paramInt2, long paramLong)
  {
    boolean bool = false;
    AppMethodBeat.i(76180);
    if ((paramFileOutputStream == null) || (paramArrayOfByte == null))
      AppMethodBeat.o(76180);
    while (true)
    {
      return bool;
      if (paramLong != this.mFileDataLen)
      {
        TMLog.i("TMAssistantFile", "writeData0 failed,filelen:" + this.mFileDataLen + ",offset:" + paramLong + ",filename:" + this.mTempFileName);
        AppMethodBeat.o(76180);
      }
      else
      {
        if (paramInt2 >= 16384);
        while (true)
        {
          try
          {
            if (this.mDataBufferDataLen > 0)
            {
              paramFileOutputStream.write(this.mWriteDataBuffer, 0, this.mDataBufferDataLen);
              this.mDataBufferDataLen = 0;
            }
            paramFileOutputStream.write(paramArrayOfByte, paramInt1, paramInt2);
            this.mFileDataLen += paramInt2;
            bool = true;
            AppMethodBeat.o(76180);
          }
          catch (IOException paramFileOutputStream)
          {
            ab.printErrStackTrace("TMAssistantFile", paramFileOutputStream, "", new Object[0]);
            TMLog.w("TMAssistantFile", "writeData1 failed " + paramFileOutputStream.getMessage());
            AppMethodBeat.o(76180);
          }
          break;
          if ((this.mDataBufferDataLen + paramInt2 > 16384) && (this.mDataBufferDataLen > 0));
          try
          {
            paramFileOutputStream.write(this.mWriteDataBuffer, 0, this.mDataBufferDataLen);
            this.mDataBufferDataLen = 0;
            System.arraycopy(paramArrayOfByte, paramInt1, this.mWriteDataBuffer, this.mDataBufferDataLen, paramInt2);
            this.mDataBufferDataLen += paramInt2;
            this.mFileDataLen += paramInt2;
          }
          catch (IOException paramFileOutputStream)
          {
            ab.printErrStackTrace("TMAssistantFile", paramFileOutputStream, "", new Object[0]);
            TMLog.w("TMAssistantFile", "writeData2 failed " + paramFileOutputStream.getMessage());
            AppMethodBeat.o(76180);
          }
        }
      }
    }
  }

  public void close()
  {
    try
    {
      AppMethodBeat.i(76174);
      flush();
      try
      {
        if (this.mFileOutputStream != null)
          this.mFileOutputStream.close();
        this.mFileOutputStream = null;
        this.mWriteDataBuffer = null;
        this.mFileDataLen = 0L;
        AppMethodBeat.o(76174);
        return;
      }
      catch (IOException localIOException)
      {
        while (true)
          ab.printErrStackTrace("TMAssistantFile", localIOException, "", new Object[0]);
      }
    }
    finally
    {
    }
  }

  public void deleteTempFile()
  {
    AppMethodBeat.i(76169);
    String str = getTmpFilePath(this.mTempFileName);
    TMLog.i("TMAssistantFile", "deleteFile 1 tmpFilePathString: ".concat(String.valueOf(str)));
    if (!TextUtils.isEmpty(str))
    {
      File localFile = new File(str);
      TMLog.i("TMAssistantFile", "deleteFile 2 file: ".concat(String.valueOf(localFile)));
      if (localFile.exists())
      {
        boolean bool = localFile.delete();
        TMLog.i("TMAssistantFile", "deleteFile result:" + bool + ",filename:" + str);
        AppMethodBeat.o(76169);
      }
    }
    while (true)
    {
      return;
      TMLog.i("TMAssistantFile", "deleteFile 3");
      AppMethodBeat.o(76169);
    }
  }

  void ensureFilePath(String paramString)
  {
    boolean bool = true;
    AppMethodBeat.i(76171);
    if (TextUtils.isEmpty(paramString))
    {
      TMLog.i("TMAssistantFile", "fileFullPath is null or the filename.size is zero.");
      paramString = new InvalidParameterException("fileFullPath is null or the filename.size is zero.");
      AppMethodBeat.o(76171);
      throw paramString;
    }
    int i = paramString.lastIndexOf("/");
    if ((i == -1) || (paramString.length() == 1))
    {
      TMLog.i("TMAssistantFile", "fileFullPath is not a valid full path. fileName: ".concat(String.valueOf(paramString)));
      paramString = new InvalidParameterException("fileFullPath is not a valid full path. fileName: ".concat(String.valueOf(paramString)));
      AppMethodBeat.o(76171);
      throw paramString;
    }
    String str = paramString;
    if (i > 0)
      str = paramString.substring(0, i);
    paramString = new File(str);
    if (!paramString.exists())
      bool = paramString.mkdirs();
    if (!bool)
    {
      TMLog.i("TMAssistantFile", "Failed to create directory. dir: ".concat(String.valueOf(str)));
      paramString = new IOException("Failed to create directory. dir: ".concat(String.valueOf(str)));
      AppMethodBeat.o(76171);
      throw paramString;
    }
    AppMethodBeat.o(76171);
  }

  public boolean flush()
  {
    boolean bool = false;
    try
    {
      AppMethodBeat.i(76173);
      if (this.mFileOutputStream != null)
      {
        int i = this.mDataBufferDataLen;
        if (i <= 0);
      }
      while (true)
      {
        try
        {
          this.mFileOutputStream.write(this.mWriteDataBuffer, 0, this.mDataBufferDataLen);
          this.mDataBufferDataLen = 0;
          bool = true;
          AppMethodBeat.o(76173);
          return bool;
        }
        catch (IOException localIOException)
        {
          ab.printErrStackTrace("TMAssistantFile", localIOException, "", new Object[0]);
          TMLog.w("TMAssistantFile", "flush failed ".concat(String.valueOf(localIOException)));
        }
        AppMethodBeat.o(76173);
      }
    }
    finally
    {
    }
  }

  public String getTmpFilePath(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(76176);
    if (paramString == null)
    {
      AppMethodBeat.o(76176);
      paramString = localObject;
    }
    while (true)
    {
      return paramString;
      String str = getSavePathRootDir();
      if (str == null)
      {
        AppMethodBeat.o(76176);
        paramString = localObject;
      }
      else
      {
        paramString = str + "/.tmp/" + paramString + ".tmp";
        AppMethodBeat.o(76176);
      }
    }
  }

  public long length()
  {
    long l = 0L;
    AppMethodBeat.i(76170);
    Object localObject = getSaveFilePath(this.mFinalFileName);
    String str;
    if (localObject != null)
    {
      localObject = new File((String)localObject);
      if (!((File)localObject).exists())
      {
        str = getTmpFilePath(this.mTempFileName);
        if (str != null)
        {
          localObject = new File(str);
          if (!((File)localObject).exists())
            this.mFileDataLen = 0L;
        }
        else
        {
          l = this.mFileDataLen;
          AppMethodBeat.o(76170);
        }
      }
    }
    while (true)
    {
      return l;
      TMLog.i("TMAssistantFile", str + " exists");
      this.mFileDataLen = ((File)localObject).length();
      break;
      this.mFileDataLen = ((File)localObject).length();
      break;
      AppMethodBeat.o(76170);
    }
  }

  public void moveFileToSavaPath()
  {
    AppMethodBeat.i(76178);
    moveFileFromTmpToSavaPath(getTmpFilePath(this.mTempFileName), getSaveFilePath(this.mFinalFileName));
    AppMethodBeat.o(76178);
  }

  public boolean write(byte[] paramArrayOfByte, int paramInt1, int paramInt2, long paramLong, boolean paramBoolean)
  {
    boolean bool = false;
    while (true)
    {
      try
      {
        AppMethodBeat.i(76172);
        Object localObject;
        if (this.mFileOutputStream == null)
        {
          localObject = getTmpFilePath(this.mTempFileName);
          if (localObject == null);
        }
        else
        {
          try
          {
            ensureFilePath((String)localObject);
            FileOutputStream localFileOutputStream = new java/io/FileOutputStream;
            localFileOutputStream.<init>((String)localObject, true);
            this.mFileOutputStream = localFileOutputStream;
            if (this.mWriteDataBuffer == null)
            {
              this.mWriteDataBuffer = new byte[16384];
              this.mDataBufferDataLen = 0;
            }
            bool = writeData(this.mFileOutputStream, paramArrayOfByte, paramInt1, paramInt2, paramLong);
            if (bool)
              break label196;
            AppMethodBeat.o(76172);
            paramBoolean = bool;
            return paramBoolean;
          }
          catch (Exception paramArrayOfByte)
          {
            ab.printErrStackTrace("TMAssistantFile", paramArrayOfByte, "", new Object[0]);
            localObject = new java/lang/StringBuilder;
            ((StringBuilder)localObject).<init>("write failed");
            TMLog.w("TMAssistantFile", paramArrayOfByte.getMessage());
            AppMethodBeat.o(76172);
            paramBoolean = bool;
            continue;
          }
        }
      }
      finally
      {
      }
      TMLog.w("TMAssistantFile", "write failed tmpFilePathString is null");
      AppMethodBeat.o(76172);
      paramBoolean = bool;
      continue;
      label196: if ((paramBoolean == true) && (flush() == true))
      {
        paramBoolean = moveFileFromTmpToSavaPath(getTmpFilePath(this.mTempFileName), getSaveFilePath(this.mFinalFileName));
        AppMethodBeat.o(76172);
      }
      else
      {
        AppMethodBeat.o(76172);
        paramBoolean = true;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.tmassistantsdk.storage.TMAssistantFile
 * JD-Core Version:    0.6.2
 */