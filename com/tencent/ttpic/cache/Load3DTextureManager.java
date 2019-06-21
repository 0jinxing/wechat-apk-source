package com.tencent.ttpic.cache;

import android.graphics.Bitmap;
import android.opengl.ETC1Util.ETC1Texture;
import android.os.AsyncTask;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.ttpic.gameplaysdk.GamePlaySDK;
import com.tencent.ttpic.thread.VideoThreadPool;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Load3DTextureManager
  implements LoadItemManager
{
  private String dataPath;
  private List<AsyncTask<Void, Integer, Boolean>> mImageTasks;
  private String[] textureImages;

  public Load3DTextureManager(String paramString, String[] paramArrayOfString)
  {
    this.dataPath = paramString;
    this.textureImages = paramArrayOfString;
  }

  public void clear()
  {
    AppMethodBeat.i(81775);
    GamePlaySDK.getInstance().clearItemImage();
    if (this.mImageTasks != null)
    {
      Iterator localIterator = this.mImageTasks.iterator();
      while (localIterator.hasNext())
        ((AsyncTask)localIterator.next()).cancel(true);
    }
    AppMethodBeat.o(81775);
  }

  public ETC1Util.ETC1Texture loadETCAlphaTexture(int paramInt)
  {
    return null;
  }

  public ETC1Util.ETC1Texture loadETCRGBTexture(int paramInt)
  {
    return null;
  }

  public Bitmap loadImage(int paramInt)
  {
    return null;
  }

  public Bitmap loadImage(String paramString)
  {
    return null;
  }

  public void prepareImages()
  {
    AppMethodBeat.i(81774);
    ArrayList localArrayList = new ArrayList();
    if ((this.textureImages != null) && (this.textureImages.length > 0))
    {
      this.mImageTasks = new ArrayList();
      for (int i = 0; i < 4; i++)
        localArrayList.add(new ArrayList());
      i = 0;
      int j = 0;
      while (j < this.textureImages.length)
      {
        ((List)localArrayList.get(i)).add(this.textureImages[j]);
        j++;
        i = (i + 1) % 4;
      }
      this.mImageTasks = new ArrayList();
      for (i = 0; i < localArrayList.size(); i++)
      {
        Load3DTextureTask localLoad3DTextureTask = new Load3DTextureTask(this.dataPath, (List)localArrayList.get(i));
        localLoad3DTextureTask.executeOnExecutor(VideoThreadPool.getInstance().getDualThreadExecutor(), new Void[0]);
        this.mImageTasks.add(localLoad3DTextureTask);
      }
    }
    AppMethodBeat.o(81774);
  }

  public void reset()
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.cache.Load3DTextureManager
 * JD-Core Version:    0.6.2
 */