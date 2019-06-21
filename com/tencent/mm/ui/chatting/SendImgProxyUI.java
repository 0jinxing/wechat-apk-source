package com.tencent.mm.ui.chatting;

import android.app.Activity;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.o;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.hardcoder.WXHardCoderJNI;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.r;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.MMBaseActivity;
import com.tencent.mm.ui.ae;
import com.tencent.mm.ui.base.p;
import java.util.ArrayList;
import java.util.Iterator;

public class SendImgProxyUI extends MMBaseActivity
{
  private static boolean isRunning = false;
  private p iGY = null;

  private static ArrayList<String> a(ArrayList<String> paramArrayList1, int paramInt, ArrayList<String> paramArrayList2, boolean paramBoolean)
  {
    AppMethodBeat.i(31007);
    ArrayList localArrayList = new ArrayList();
    if (paramArrayList1 != null)
    {
      Iterator localIterator = paramArrayList1.iterator();
      while (localIterator.hasNext())
      {
        paramArrayList1 = (String)localIterator.next();
        if (r.amn(paramArrayList1))
        {
          long l = com.tencent.mm.vfs.e.asZ(paramArrayList1);
          if ((!paramBoolean) && (l > paramInt))
            paramArrayList2.add(paramArrayList1);
          else
            localArrayList.add(paramArrayList1);
        }
      }
    }
    AppMethodBeat.o(31007);
    return localArrayList;
  }

  private static void g(ArrayList<Integer> paramArrayList, ArrayList<String> paramArrayList1)
  {
    AppMethodBeat.i(31008);
    if (paramArrayList.size() != paramArrayList1.size())
    {
      ab.e("MicroMsg.SendImgProxyUI", "[insertErrMsg] WTF");
      AppMethodBeat.o(31008);
    }
    while (true)
    {
      return;
      for (int i = 0; i < paramArrayList1.size(); i++)
      {
        int j = ((Integer)paramArrayList.get(i)).intValue();
        Object localObject = o.ahl().ly(j);
        int k = (int)com.tencent.mm.vfs.e.asZ((String)paramArrayList1.get(i));
        ((com.tencent.mm.at.e)localObject).setOffset(k);
        ((com.tencent.mm.at.e)localObject).lt(k);
        o.ahl().a(j, (com.tencent.mm.at.e)localObject);
        long l = ((com.tencent.mm.at.e)localObject).fDH;
        ab.i("MicroMsg.SendImgProxyUI", "[insertErrMsg] msgLocalId:%s oriImgLocalId:%s", new Object[] { Long.valueOf(l), Integer.valueOf(j) });
        localObject = ((j)com.tencent.mm.kernel.g.K(j.class)).bOr().jf(l);
        ((bi)localObject).setStatus(5);
        ((bi)localObject).ht(256);
        ((j)com.tencent.mm.kernel.g.K(j.class)).bOr().a(l, (bi)localObject);
        ab.i("MicroMsg.SendImgProxyUI", "after update msgInfo, localId[%d] svrId[%d] talker[%s] type[%d] isSend[%d] imgPath[%s], status[%d] createTime[%d]", new Object[] { Long.valueOf(((cy)localObject).field_msgId), Long.valueOf(((cy)localObject).field_msgSvrId), ((cy)localObject).field_talker, Integer.valueOf(((bi)localObject).getType()), Integer.valueOf(((cy)localObject).field_isSend), ((cy)localObject).field_imgPath, Integer.valueOf(((cy)localObject).field_status), Long.valueOf(((cy)localObject).field_createTime) });
      }
      AppMethodBeat.o(31008);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    int i = 0;
    AppMethodBeat.i(31004);
    super.onCreate(paramBundle);
    overridePendingTransition(0, 0);
    ae.a(getWindow());
    ab.i("MicroMsg.SendImgProxyUI", "onCreate isRunning:%b ,%d", new Object[] { Boolean.valueOf(isRunning), Integer.valueOf(hashCode()) });
    if (isRunning)
    {
      ab.w("MicroMsg.SendImgProxyUI", "duplicate instance");
      finish();
      AppMethodBeat.o(31004);
    }
    while (true)
    {
      return;
      isRunning = true;
      setContentView(2130968794);
      this.iGY = com.tencent.mm.ui.base.h.b(this, getString(2131301306), false, null);
      boolean bool1 = at.isWifi(this);
      boolean bool2 = WXHardCoderJNI.hcSendPicMsgEnable;
      int j = WXHardCoderJNI.hcSendPicMsgDelay;
      int k = WXHardCoderJNI.hcSendPicMsgCPU;
      int m = WXHardCoderJNI.hcSendPicMsgIO;
      if (WXHardCoderJNI.hcSendPicMsgThr)
        i = com.tencent.mm.kernel.g.RS().doL();
      i = WXHardCoderJNI.startPerformance(bool2, j, k, m, i, WXHardCoderJNI.hcSendPicMsgTimeout, 203, WXHardCoderJNI.hcSendPicMsgAction, "MicroMsg.SendImgProxyUI");
      aw.RS().aa(new SendImgProxyUI.1(this, bool1, i));
      AppMethodBeat.o(31004);
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(31005);
    ab.i("MicroMsg.SendImgProxyUI", "onDestroy isRunning:%b , %d", new Object[] { Boolean.valueOf(isRunning), Integer.valueOf(hashCode()) });
    super.onDestroy();
    AppMethodBeat.o(31005);
  }

  public void onResume()
  {
    AppMethodBeat.i(31006);
    ab.i("MicroMsg.SendImgProxyUI", "onResume isRunning:%b ,%d", new Object[] { Boolean.valueOf(isRunning), Integer.valueOf(hashCode()) });
    super.onResume();
    AppMethodBeat.o(31006);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.SendImgProxyUI
 * JD-Core Version:    0.6.2
 */