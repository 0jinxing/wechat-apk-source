package com.tencent.mm.plugin.location.ui;

import android.content.Context;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.r;
import com.tencent.mm.model.s;
import com.tencent.mm.plugin.k.d;
import com.tencent.mm.plugin.location.model.l;
import com.tencent.mm.plugin.location.model.p;
import com.tencent.mm.plugin.location.ui.impl.TrackPoint;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.MMHorList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class i
  implements h.c, k.a
{
  private Context context;
  private String ejR;
  private ViewGroup nMI;
  private View nMJ;
  private h nMK;
  private j nML;
  private ArrayList<String> nMM;
  private String nMN;
  private boolean nMO;
  public i.a nMP;
  private d nMj;

  public i(Context paramContext, ViewGroup paramViewGroup, View paramView, String paramString, d paramd)
  {
    AppMethodBeat.i(113512);
    this.nMN = "";
    this.ejR = "";
    this.nMO = false;
    this.nMI = paramViewGroup;
    this.nMJ = paramView;
    this.context = paramContext;
    this.nMM = new ArrayList();
    this.ejR = paramString;
    this.nMj = paramd;
    init();
    AppMethodBeat.o(113512);
  }

  private void init()
  {
    AppMethodBeat.i(113513);
    ab.d("MicroMsg.ShareHeaderMgr", "init ShareHeaderMgr, roomname=%s", new Object[] { this.ejR });
    this.nMK = new h(this.context, this.nMJ, this.ejR);
    this.nMK.nMA = this;
    this.nML = new j(this.context, this.nMI, this.ejR);
    Iterator localIterator = l.bJz().tP(this.ejR).iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      this.nMM.add(str);
    }
    AppMethodBeat.o(113513);
  }

  public final void H(ArrayList<String> paramArrayList)
  {
    AppMethodBeat.i(113514);
    ab.d("MicroMsg.ShareHeaderMgr", "onRefreshMemberList, members.size=%d", new Object[] { Integer.valueOf(paramArrayList.size()) });
    this.nMK.H(paramArrayList);
    j localj = this.nML;
    ab.d("MicroMsg.ShareHeaderMsgMgr", "onRefreshMemberList, size=%d", new Object[] { Integer.valueOf(paramArrayList.size()) });
    Object localObject1 = new ArrayList();
    Object localObject2 = new ArrayList();
    Object localObject3 = paramArrayList.iterator();
    while (((Iterator)localObject3).hasNext())
    {
      localObject4 = (String)((Iterator)localObject3).next();
      if (localj.nMR.indexOf(localObject4) == -1)
        ((ArrayList)localObject1).add(localObject4);
    }
    Object localObject4 = localj.nMR.iterator();
    while (((Iterator)localObject4).hasNext())
    {
      localObject3 = (String)((Iterator)localObject4).next();
      if (paramArrayList.indexOf(localObject3) == -1)
        ((ArrayList)localObject2).add(localObject3);
    }
    if (localj.nNd)
    {
      localj.nNd = false;
      if (((ArrayList)localObject1).size() > 0)
      {
        paramArrayList = ((ArrayList)localObject1).iterator();
        while (paramArrayList.hasNext())
        {
          localObject2 = (String)paramArrayList.next();
          localj.nMR.add(localObject2);
        }
      }
      localj.iC(false);
      AppMethodBeat.o(113514);
    }
    while (true)
    {
      return;
      if (((ArrayList)localObject1).size() > 0)
      {
        paramArrayList = (String)((ArrayList)localObject1).get(0);
        localj.nMR.add(paramArrayList);
        if (!bo.isNullOrNil(s.mJ(paramArrayList)))
        {
          localj.mHandler.removeMessages(3);
          localObject1 = Message.obtain();
          ((Message)localObject1).what = 3;
          ((Message)localObject1).obj = paramArrayList;
          localj.mHandler.sendMessage((Message)localObject1);
          localj.iC(true);
        }
      }
      if (((ArrayList)localObject2).size() > 0)
      {
        paramArrayList = (String)((ArrayList)localObject2).get(0);
        if ((!bo.isNullOrNil(paramArrayList)) && (localj.nMR.indexOf(paramArrayList) != -1))
        {
          localj.nMR.remove(localj.nMR.indexOf(paramArrayList));
          if (!bo.isNullOrNil(s.mJ(paramArrayList)))
          {
            localObject2 = Message.obtain();
            ((Message)localObject2).what = 4;
            ((Message)localObject2).obj = paramArrayList;
            localj.mHandler.sendMessage((Message)localObject2);
            localj.iC(true);
          }
        }
      }
      AppMethodBeat.o(113514);
    }
  }

  public final void PX(String paramString)
  {
    AppMethodBeat.i(113515);
    if (this.nMP != null)
      this.nMP.PX(paramString);
    AppMethodBeat.o(113515);
  }

  public final void PY(String paramString)
  {
    AppMethodBeat.i(113517);
    ab.d("MicroMsg.ShareHeaderMgr", "onCurTalkerChange, username = %s", new Object[] { paramString });
    if (this.nMO)
    {
      AppMethodBeat.o(113517);
      return;
    }
    this.nMN = paramString;
    paramString = this.nMK;
    Object localObject = this.nMN;
    ab.i("MicroMsg.ShareHeaderAvatarViewMgr", "onCurMemberChange, username=%s", new Object[] { localObject });
    if (bo.isNullOrNil((String)localObject))
    {
      paramString.bJR();
      label74: paramString = this.nML;
      String str = this.nMN;
      ab.d("MicroMsg.ShareHeaderMsgMgr", "onCurMemberChange, curMember=%s", new Object[] { str });
      if (bo.isNullOrNil(str))
        break label205;
      if (!bo.isNullOrNil(s.mJ(str)))
      {
        paramString.nNi = true;
        paramString.mHandler.removeMessages(5);
        localObject = Message.obtain();
        ((Message)localObject).what = 5;
        ((Message)localObject).obj = str;
        paramString.mHandler.sendMessageAtFrontOfQueue((Message)localObject);
      }
      paramString.iC(true);
    }
    while (true)
    {
      paramString = this.nMj.getViewByItag(this.nMN);
      if ((paramString instanceof TrackPoint))
        ((TrackPoint)paramString).set2Top();
      AppMethodBeat.o(113517);
      break;
      paramString.bJR();
      paramString.PU((String)localObject);
      break label74;
      label205: paramString.nNi = false;
      paramString.mHandler.removeMessages(10);
      localObject = Message.obtain();
      ((Message)localObject).what = 10;
      paramString.mHandler.sendMessage((Message)localObject);
      paramString.iC(true);
    }
  }

  public final void PZ(String paramString)
  {
    AppMethodBeat.i(113520);
    j localj = this.nML;
    ab.d("MicroMsg.ShareHeaderMsgMgr", "onTalkConflict, username=%s", new Object[] { paramString });
    if ((!bo.isNullOrNil(paramString)) && (!bo.isNullOrNil(s.mJ(paramString))))
    {
      localj.nNi = true;
      localj.mHandler.removeMessages(7);
      paramString = Message.obtain();
      paramString.what = 7;
      localj.mHandler.sendMessageAtFrontOfQueue(paramString);
    }
    AppMethodBeat.o(113520);
  }

  public final void bJV()
  {
    AppMethodBeat.i(113516);
    ab.d("MicroMsg.ShareHeaderMgr", "onMyselfTalking");
    this.nMO = true;
    String str = r.Yz();
    this.nMK.bJR();
    this.nMK.PU(str);
    Object localObject = this.nML;
    ab.d("MicroMsg.ShareHeaderMsgMgr", "onMyselfTalking");
    ((j)localObject).mHandler.removeMessages(6);
    ((j)localObject).mHandler.removeMessages(5);
    Message localMessage = Message.obtain();
    localMessage.what = 6;
    ((j)localObject).mHandler.sendMessageAtFrontOfQueue(localMessage);
    localObject = this.nMj.getViewByItag(str);
    if ((localObject instanceof TrackPoint))
      ((TrackPoint)localObject).set2Top();
    this.nMN = str;
    AppMethodBeat.o(113516);
  }

  public final void bJW()
  {
    AppMethodBeat.i(113518);
    ab.i("MicroMsg.ShareHeaderMgr", "onMyselfFinishTalking");
    Object localObject1 = this.nMK;
    Object localObject2 = r.Yz();
    ab.d("MicroMsg.ShareHeaderAvatarViewMgr", "onMemberFinishTalking, username=%s", new Object[] { localObject2 });
    if (((h)localObject1).nMy.PW((String)localObject2))
    {
      ((h)localObject1).nMy.PV((String)localObject2).bJU();
      ((h)localObject1).nMy.notifyDataSetChanged();
      ((h)localObject1).nMx.invalidate();
    }
    localObject1 = this.nML;
    ab.d("MicroMsg.ShareHeaderMsgMgr", "onMyselfFinishTalking");
    ((j)localObject1).mHandler.removeMessages(9);
    ((j)localObject1).mHandler.removeMessages(10);
    localObject2 = Message.obtain();
    ((Message)localObject2).what = 9;
    ((j)localObject1).mHandler.sendMessage((Message)localObject2);
    this.nMN = "";
    this.nMO = false;
    AppMethodBeat.o(113518);
  }

  public final void bJX()
  {
    AppMethodBeat.i(113519);
    j localj = this.nML;
    ab.d("MicroMsg.ShareHeaderMsgMgr", "onPrepareTalking");
    localj.mHandler.removeMessages(8);
    Message localMessage = Message.obtain();
    localMessage.what = 8;
    localj.mHandler.sendMessageAtFrontOfQueue(localMessage);
    AppMethodBeat.o(113519);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.location.ui.i
 * JD-Core Version:    0.6.2
 */