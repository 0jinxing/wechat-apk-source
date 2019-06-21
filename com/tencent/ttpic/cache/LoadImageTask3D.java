package com.tencent.ttpic.cache;

import android.os.AsyncTask;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.ttpic.gameplaysdk.GamePlaySDK;
import java.util.Iterator;
import java.util.List;

public class LoadImageTask3D extends AsyncTask<Void, Integer, Boolean>
{
  private String dataPath;
  private List<String> resourceList;

  public LoadImageTask3D(String paramString, List<String> paramList)
  {
    this.dataPath = paramString;
    this.resourceList = paramList;
  }

  protected Boolean doInBackground(Void[] paramArrayOfVoid)
  {
    AppMethodBeat.i(81801);
    if (this.resourceList != null)
    {
      Iterator localIterator = this.resourceList.iterator();
      while (localIterator.hasNext())
      {
        paramArrayOfVoid = (String)localIterator.next();
        GamePlaySDK.getInstance().loadItemImage(this.dataPath, paramArrayOfVoid);
      }
    }
    paramArrayOfVoid = Boolean.TRUE;
    AppMethodBeat.o(81801);
    return paramArrayOfVoid;
  }

  protected void onCancelled(Boolean paramBoolean)
  {
    AppMethodBeat.i(81802);
    super.onCancelled(paramBoolean);
    AppMethodBeat.o(81802);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.cache.LoadImageTask3D
 * JD-Core Version:    0.6.2
 */