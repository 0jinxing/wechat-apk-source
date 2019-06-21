package com.tencent.ttpic.cache;

import android.os.AsyncTask;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.ttpic.gameplaysdk.GamePlaySDK;
import java.util.Iterator;
import java.util.List;

public class Load3DTextureTask extends AsyncTask<Void, Integer, Boolean>
{
  private String dataPath;
  private List<String> resourceList;

  public Load3DTextureTask(String paramString, List<String> paramList)
  {
    this.dataPath = paramString;
    this.resourceList = paramList;
  }

  protected Boolean doInBackground(Void[] paramArrayOfVoid)
  {
    AppMethodBeat.i(81776);
    if (this.resourceList != null)
    {
      Iterator localIterator = this.resourceList.iterator();
      while (localIterator.hasNext())
      {
        paramArrayOfVoid = (String)localIterator.next();
        GamePlaySDK.getInstance().loadItemImage(this.dataPath, paramArrayOfVoid, true);
      }
    }
    paramArrayOfVoid = Boolean.TRUE;
    AppMethodBeat.o(81776);
    return paramArrayOfVoid;
  }

  protected void onCancelled(Boolean paramBoolean)
  {
    AppMethodBeat.i(81777);
    super.onCancelled(paramBoolean);
    AppMethodBeat.o(81777);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.cache.Load3DTextureTask
 * JD-Core Version:    0.6.2
 */