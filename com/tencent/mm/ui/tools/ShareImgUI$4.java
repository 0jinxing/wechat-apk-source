package com.tencent.mm.ui.tools;

import android.os.Bundle;
import android.os.Parcelable;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;

final class ShareImgUI$4
  implements Runnable
{
  ShareImgUI$4(ShareImgUI paramShareImgUI, Bundle paramBundle, ShareImgUI.b paramb, long paramLong)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(34939);
    Object localObject1 = this.hXc.getParcelableArrayList("android.intent.extra.STREAM");
    ArrayList localArrayList;
    Object localObject2;
    Object localObject4;
    Object localObject5;
    if ((localObject1 != null) && (((ArrayList)localObject1).size() > 0))
    {
      localArrayList = new ArrayList();
      localObject2 = new CountDownLatch(((ArrayList)localObject1).size());
      localObject4 = new boolean[1];
      localObject4[0] = 0;
      localObject5 = ((ArrayList)localObject1).iterator();
      while (((Iterator)localObject5).hasNext())
      {
        localObject1 = (Parcelable)((Iterator)localObject5).next();
        d.post(new ShareImgUI.4.1(this, localArrayList, (Parcelable)localObject1, (boolean[])localObject4, (CountDownLatch)localObject2), "getMultiSendFilePathListItem" + localObject1.toString());
      }
    }
    while (true)
    {
      try
      {
        ((CountDownLatch)localObject2).await();
        if (localObject4[0] != 0)
        {
          ab.d("MicroMsg.ShareImgUI", "hy: has non path img");
          localObject2 = this.zHr;
          localObject4 = this.zHs;
          localObject1 = null;
          ShareImgUI.a((ShareImgUI)localObject2, (ShareImgUI.b)localObject4, (ArrayList)localObject1);
          AppMethodBeat.o(34939);
          return;
        }
      }
      catch (InterruptedException localInterruptedException)
      {
        ab.printErrStackTrace("MicroMsg.ShareImgUI", localInterruptedException, "hy: timeout when getmulti", new Object[0]);
        ShareImgUI.a(this.zHr, this.zHs, null);
        continue;
        ab.i("MicroMsg.ShareImgUI", "hy: getMultiSendFilePathList done. using: %d ms", new Object[] { Long.valueOf(System.currentTimeMillis() - this.zHt) });
        localObject1 = this.zHr;
        localObject5 = this.zHs;
        localObject4 = localObject5;
        Object localObject3 = localObject1;
        if (localArrayList.size() <= 0)
          continue;
        localObject4 = localObject5;
        localObject3 = localObject1;
        localObject1 = localArrayList;
        continue;
      }
      ab.e("MicroMsg.ShareImgUI", "getParcelableArrayList failed");
      ShareImgUI.a(this.zHr, this.zHs, null);
      AppMethodBeat.o(34939);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.ShareImgUI.4
 * JD-Core Version:    0.6.2
 */