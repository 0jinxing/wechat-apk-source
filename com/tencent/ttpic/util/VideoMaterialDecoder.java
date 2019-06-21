package com.tencent.ttpic.util;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.ttpic.thread.VideoThreadPool;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;

public class VideoMaterialDecoder
{
  public static final String MATERIAL_PREFIX = "video_";
  private static final String TAG;
  private static VideoMaterialDecoder ins;
  private List<VideoMaterialDecoder.DecodeVideoTask> mTaskList;

  static
  {
    AppMethodBeat.i(84049);
    TAG = VideoMaterialDecoder.class.getSimpleName();
    ins = new VideoMaterialDecoder();
    AppMethodBeat.o(84049);
  }

  private VideoMaterialDecoder()
  {
    AppMethodBeat.i(84047);
    this.mTaskList = new ArrayList();
    AppMethodBeat.o(84047);
  }

  public static VideoMaterialDecoder getInstance()
  {
    return ins;
  }

  public void saveVideoMaterialToImages(String paramString)
  {
    AppMethodBeat.i(84048);
    Object localObject1 = VideoMaterialUtil.getMaterialId(paramString);
    if ((localObject1 == null) || (!((String)localObject1).startsWith("video_")))
      AppMethodBeat.o(84048);
    while (true)
    {
      return;
      Object localObject2 = new File(paramString).listFiles();
      if (localObject2 == null)
      {
        AppMethodBeat.o(84048);
      }
      else
      {
        this.mTaskList.clear();
        int i = localObject2.length;
        for (int j = 0; j < i; j++)
        {
          paramString = localObject2[j];
          if (paramString.isDirectory())
          {
            localObject1 = paramString.listFiles(new VideoMaterialDecoder.1(this));
            if (localObject1 != null)
              this.mTaskList.add(new VideoMaterialDecoder.DecodeVideoTask(paramString, (File[])localObject1));
          }
        }
        if (this.mTaskList.size() == 0)
        {
          AppMethodBeat.o(84048);
        }
        else
        {
          paramString = new CountDownLatch(this.mTaskList.size());
          localObject2 = this.mTaskList.iterator();
          while (((Iterator)localObject2).hasNext())
          {
            localObject1 = (VideoMaterialDecoder.DecodeVideoTask)((Iterator)localObject2).next();
            ((VideoMaterialDecoder.DecodeVideoTask)localObject1).setCountDownLatch(paramString);
            ((VideoMaterialDecoder.DecodeVideoTask)localObject1).executeOnExecutor(VideoThreadPool.getInstance().getDualThreadExecutor(), new Void[0]);
          }
          try
          {
            paramString.await();
            AppMethodBeat.o(84048);
          }
          catch (InterruptedException paramString)
          {
            AppMethodBeat.o(84048);
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.util.VideoMaterialDecoder
 * JD-Core Version:    0.6.2
 */