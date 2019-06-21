package com.tencent.ttpic.util;

import android.os.AsyncTask;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.ttpic.baseutils.FileUtils;
import java.io.File;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

class VideoMaterialDecoder$DecodeVideoTask extends AsyncTask<Void, Integer, Boolean>
{
  private CountDownLatch countDownLatch;
  private final File dir;
  private final File[] files;

  public VideoMaterialDecoder$DecodeVideoTask(File paramFile, File[] paramArrayOfFile)
  {
    this.dir = paramFile;
    this.files = paramArrayOfFile;
  }

  protected Boolean doInBackground(Void[] paramArrayOfVoid)
  {
    AppMethodBeat.i(84045);
    try
    {
      Object localObject1 = this.files;
      int i = localObject1.length;
      int j = 0;
      while (j < i)
      {
        Object localObject2 = localObject1[j];
        FileUtils.deleteFiles(this.dir.getAbsolutePath(), ".png");
        paramArrayOfVoid = new java/io/RandomAccessFile;
        paramArrayOfVoid.<init>(((File)localObject2).getAbsoluteFile(), "r");
        long l = paramArrayOfVoid.length();
        paramArrayOfVoid.seek(l - 4L);
        localObject2 = new byte[4];
        paramArrayOfVoid.read((byte[])localObject2);
        int k = ByteUtil.readInt((byte[])localObject2);
        if ((k <= 12) || (k >= 400))
        {
          paramArrayOfVoid.close();
          j++;
        }
        else
        {
          paramArrayOfVoid.seek(l - k + 8L);
          k = (k - 12) / 4;
          localObject1 = new int[k];
          for (j = 0; j < k; j++)
          {
            paramArrayOfVoid.read((byte[])localObject2);
            localObject1[j] = ByteUtil.readInt((byte[])localObject2);
          }
          paramArrayOfVoid = new java/util/ArrayList;
          paramArrayOfVoid.<init>();
          for (j = 0; ; j++)
          {
            paramArrayOfVoid.clear();
            for (i = 0; i < k; i++)
              if (localObject1[i] == j)
              {
                localObject2 = new java/lang/StringBuilder;
                ((StringBuilder)localObject2).<init>();
                paramArrayOfVoid.add(this.dir.getAbsolutePath() + File.separator + VideoMaterialUtil.getMaterialId(this.dir.getAbsolutePath()) + "_" + i + ".png");
              }
          }
        }
      }
      if (this.countDownLatch != null)
        this.countDownLatch.countDown();
      paramArrayOfVoid = Boolean.TRUE;
      AppMethodBeat.o(84045);
      return paramArrayOfVoid;
    }
    catch (Exception paramArrayOfVoid)
    {
      while (true)
      {
        VideoMaterialDecoder.access$000();
        if (this.countDownLatch != null)
          this.countDownLatch.countDown();
      }
    }
    finally
    {
      if (this.countDownLatch != null)
        this.countDownLatch.countDown();
      AppMethodBeat.o(84045);
    }
    throw paramArrayOfVoid;
  }

  public void setCountDownLatch(CountDownLatch paramCountDownLatch)
  {
    this.countDownLatch = paramCountDownLatch;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.util.VideoMaterialDecoder.DecodeVideoTask
 * JD-Core Version:    0.6.2
 */