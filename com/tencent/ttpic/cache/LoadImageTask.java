package com.tencent.ttpic.cache;

import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.ttpic.baseutils.BitmapUtils;
import com.tencent.ttpic.util.VideoGlobalContext;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class LoadImageTask extends AsyncTask<Void, Integer, Boolean>
{
  private Map<String, Bitmap> cache;
  private String dataPath;
  private final String materialId;
  private List<String> resourceList;
  private final int sampleSize;

  public LoadImageTask(Map<String, Bitmap> paramMap, List<String> paramList, String paramString1, String paramString2, int paramInt)
  {
    AppMethodBeat.i(81793);
    this.cache = paramMap;
    this.resourceList = paramList;
    if (this.resourceList == null)
      this.resourceList = new ArrayList();
    this.dataPath = paramString1;
    this.materialId = paramString2;
    this.sampleSize = paramInt;
    AppMethodBeat.o(81793);
  }

  protected Boolean doInBackground(Void[] paramArrayOfVoid)
  {
    AppMethodBeat.i(81794);
    if (this.cache == null)
    {
      paramArrayOfVoid = Boolean.FALSE;
      AppMethodBeat.o(81794);
    }
    while (true)
    {
      return paramArrayOfVoid;
      Iterator localIterator = this.resourceList.iterator();
      paramArrayOfVoid = null;
      while (true)
      {
        if (!localIterator.hasNext())
          break label206;
        String str = (String)localIterator.next();
        if (isCancelled())
        {
          paramArrayOfVoid = Boolean.FALSE;
          AppMethodBeat.o(81794);
          break;
        }
        Object localObject = this.dataPath + File.separator + str;
        localObject = BitmapUtils.decodeSampleBitmap(VideoGlobalContext.getContext(), (String)localObject, this.sampleSize);
        if (TextUtils.isEmpty(this.materialId));
        while (true)
        {
          if (!BitmapUtils.isLegal((Bitmap)localObject))
            break label184;
          this.cache.put(str, localObject);
          paramArrayOfVoid = (Void[])localObject;
          break;
          str = this.materialId + File.separator + str;
        }
        label184: if (BitmapUtils.isLegal(paramArrayOfVoid))
          this.cache.put(str, paramArrayOfVoid);
      }
      label206: paramArrayOfVoid = Boolean.TRUE;
      AppMethodBeat.o(81794);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.cache.LoadImageTask
 * JD-Core Version:    0.6.2
 */