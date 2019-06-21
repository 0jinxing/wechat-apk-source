package com.tencent.mm.plugin.game.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.game.model.ak;
import com.tencent.mm.plugin.game.model.al;
import com.tencent.mm.plugin.game.model.e;
import com.tencent.mm.protocal.protobuf.acv;
import com.tencent.mm.protocal.protobuf.acx;
import com.tencent.mm.protocal.protobuf.acz;
import com.tencent.mm.protocal.protobuf.ada;
import com.tencent.mm.protocal.protobuf.adb;
import com.tencent.mm.protocal.protobuf.adc;
import com.tencent.mm.protocal.protobuf.add;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.tools.o;
import com.tencent.mm.ui.tools.o.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.regex.Pattern;

public class GameSearchUI extends MMActivity
  implements f, o.b
{
  private static final Pattern nmI;
  private o elS;
  private View emz;
  private int fromScene;
  private TextView mIp;
  private ViewGroup nmJ;
  private ListView nmK;
  private ListView nmL;
  private r nmM;
  private s nmN;
  private String nmO;
  private String nmP;
  private LinkedList<String> nmQ;
  private String nmR;
  private LinkedList<m> nmS;
  private boolean nmT;
  private AdapterView.OnItemClickListener nmU;
  private AdapterView.OnItemClickListener nmV;
  private ProgressBar progressBar;

  static
  {
    AppMethodBeat.i(112212);
    nmI = Pattern.compile("\\s+");
    AppMethodBeat.o(112212);
  }

  public GameSearchUI()
  {
    AppMethodBeat.i(112194);
    this.nmS = new LinkedList();
    this.nmT = false;
    this.nmU = new GameSearchUI.5(this);
    this.nmV = new GameSearchUI.6(this);
    AppMethodBeat.o(112194);
  }

  private void a(LinkedList<String> paramLinkedList, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(112201);
    while (!this.nmS.isEmpty())
    {
      g.RQ();
      g.RO().eJo.c((m)this.nmS.pop());
    }
    if (paramBoolean)
      this.nmM.reset();
    this.nmQ = paramLinkedList;
    ak localak = new ak(aa.dor(), paramLinkedList, e.bDR(), this.nmM.mXJ);
    g.Rg().a(localak, 0);
    this.nmS.add(localak);
    paramLinkedList = paramLinkedList.iterator();
    for (this.nmO = ""; paramLinkedList.hasNext(); this.nmO = (this.nmO + " " + (String)paramLinkedList.next()));
    this.nmO = this.nmO.trim();
    if ((paramInt == 1) || (paramInt == 2))
    {
      this.nmT = true;
      this.elS.setSearchContent(this.nmO);
    }
    AppMethodBeat.o(112201);
  }

  private void aa(LinkedList<String> paramLinkedList)
  {
    AppMethodBeat.i(112200);
    a(paramLinkedList, 0, true);
    AppMethodBeat.o(112200);
  }

  private void ru(int paramInt)
  {
    AppMethodBeat.i(112199);
    switch (paramInt)
    {
    default:
    case 0:
    case 1:
    case 6:
    case 2:
    case 3:
    case 4:
    case 5:
    }
    while (true)
    {
      AppMethodBeat.o(112199);
      while (true)
      {
        return;
        this.nmJ.setVisibility(8);
        this.mIp.setVisibility(8);
        this.nmK.setVisibility(8);
        this.nmL.setVisibility(8);
        this.progressBar.setVisibility(8);
        AppMethodBeat.o(112199);
        continue;
        aqX();
        this.nmK.smoothScrollToPosition(0);
        this.elS.clearFocus();
        this.nmJ.setVisibility(8);
        this.mIp.setVisibility(8);
        this.nmK.setVisibility(8);
        this.nmL.setVisibility(8);
        this.progressBar.setVisibility(0);
        AppMethodBeat.o(112199);
        continue;
        this.nmK.smoothScrollToPosition(0);
        this.nmJ.setVisibility(8);
        this.mIp.setVisibility(8);
        this.nmK.setVisibility(8);
        this.nmL.setVisibility(8);
        this.progressBar.setVisibility(0);
        AppMethodBeat.o(112199);
        continue;
        this.nmJ.setVisibility(8);
        if (this.nmM.getCount() > 0)
        {
          this.mIp.setVisibility(8);
          this.nmK.setVisibility(0);
        }
        while (true)
        {
          this.nmL.setVisibility(8);
          this.progressBar.setVisibility(8);
          AppMethodBeat.o(112199);
          break;
          this.mIp.setVisibility(0);
          this.nmK.setVisibility(8);
        }
        this.nmJ.setVisibility(0);
        this.mIp.setVisibility(8);
        this.nmK.setVisibility(8);
        this.nmL.setVisibility(8);
        this.progressBar.setVisibility(8);
        AppMethodBeat.o(112199);
        continue;
        this.nmJ.setVisibility(8);
        this.mIp.setVisibility(0);
        this.nmK.setVisibility(8);
        this.nmL.setVisibility(8);
        this.progressBar.setVisibility(8);
        AppMethodBeat.o(112199);
      }
      this.nmJ.setVisibility(8);
      this.mIp.setVisibility(8);
      this.nmK.setVisibility(8);
      this.nmL.setVisibility(0);
      this.progressBar.setVisibility(8);
    }
  }

  public final void apo()
  {
    AppMethodBeat.i(112206);
    aqX();
    onBackPressed();
    AppMethodBeat.o(112206);
  }

  public final void app()
  {
  }

  public final void apq()
  {
  }

  public final void apr()
  {
  }

  public final int getLayoutId()
  {
    return 2130969775;
  }

  public final void initView()
  {
    AppMethodBeat.i(112196);
    setBackBtn(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        AppMethodBeat.i(112188);
        GameSearchUI.this.onBackPressed();
        AppMethodBeat.o(112188);
        return true;
      }
    });
    this.elS = new o();
    this.elS.qQ(true);
    this.elS.zHa = this;
    this.nmJ = ((ViewGroup)findViewById(2131822359));
    this.progressBar = ((ProgressBar)findViewById(2131823339));
    this.mIp = ((TextView)findViewById(2131821905));
    this.nmK = ((ListView)findViewById(2131823338));
    this.nmM = new r(this);
    this.nmK.setAdapter(this.nmM);
    this.nmK.setOnItemClickListener(this.nmU);
    this.nmK.setOnTouchListener(new GameSearchUI.2(this));
    this.nmK.setOnScrollListener(new GameSearchUI.3(this));
    this.emz = getLayoutInflater().inflate(2130969741, this.nmK, false);
    this.emz.setVisibility(8);
    this.nmK.addFooterView(this.emz);
    this.nmL = ((ListView)findViewById(2131824624));
    this.nmN = new s(this);
    this.nmL.setAdapter(this.nmN);
    this.nmL.setOnItemClickListener(this.nmV);
    this.nmL.setOnTouchListener(new GameSearchUI.4(this));
    AppMethodBeat.o(112196);
  }

  public void onBackPressed()
  {
    AppMethodBeat.i(112204);
    super.onBackPressed();
    AppMethodBeat.o(112204);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(112195);
    long l = System.currentTimeMillis();
    super.onCreate(paramBundle);
    if (!g.RK())
    {
      ab.e("MicroMsg.GameSearchUI", "account not ready");
      finish();
      AppMethodBeat.o(112195);
    }
    while (true)
    {
      return;
      g.Rg().a(1328, this);
      g.Rg().a(1329, this);
      this.fromScene = getIntent().getIntExtra("game_report_from_scene", 0);
      initView();
      com.tencent.mm.plugin.game.e.b.a(this, 14, 1401, 0, 2, this.fromScene, null);
      ab.i("MicroMsg.GameSearchUI", "[onCreate] time:" + (System.currentTimeMillis() - l));
      AppMethodBeat.o(112195);
    }
  }

  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    AppMethodBeat.i(112197);
    this.elS.a(this, paramMenu);
    this.elS.setHint(e.bEe());
    AppMethodBeat.o(112197);
    return true;
  }

  public void onDestroy()
  {
    AppMethodBeat.i(112205);
    ab.i("MicroMsg.GameSearchUI", "onDestroy");
    super.onDestroy();
    g.Rg().b(1328, this);
    g.Rg().b(1329, this);
    AppMethodBeat.o(112205);
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(112203);
    boolean bool;
    if ((paramInt == 4) && (paramKeyEvent.getRepeatCount() == 0))
    {
      onBackPressed();
      bool = true;
      AppMethodBeat.o(112203);
    }
    while (true)
    {
      return bool;
      bool = super.onKeyDown(paramInt, paramKeyEvent);
      AppMethodBeat.o(112203);
    }
  }

  public boolean onPrepareOptionsMenu(Menu paramMenu)
  {
    AppMethodBeat.i(112198);
    this.elS.a(this, paramMenu);
    AppMethodBeat.o(112198);
    return true;
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(112202);
    if (paramm.bqV)
    {
      AppMethodBeat.o(112202);
      return;
    }
    if (this.nmS.contains(paramm))
      this.nmS.remove(paramm);
    this.emz.setVisibility(8);
    switch (paramm.getType())
    {
    default:
    case 1328:
    case 1329:
    }
    while (true)
    {
      AppMethodBeat.o(112202);
      break;
      paramString = (acz)((ak)paramm).lty.fsG.fsP;
      ab.d("MicroMsg.GameSearchUI", "keywords = %s, offset = %d", new Object[] { paramString.wkL, Integer.valueOf(paramString.wkM) });
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        paramString = (ada)((ak)paramm).lty.fsH.fsP;
        label214: Object localObject3;
        label284: Object localObject4;
        if (paramString != null)
        {
          paramString = paramString.wkN;
          if (bo.ek(paramString))
            break label1768;
          this.nmP = this.nmO;
          if (this.nmM.mXJ != 0)
          {
            paramm = this.nmM;
            localObject1 = this.nmP;
            paramString = paramString.iterator();
          }
        }
        else
        {
          while (true)
          {
            if (!paramString.hasNext())
              break label1768;
            localObject2 = (adb)paramString.next();
            if ((((adb)localObject2).type == 3) && (!bo.ek(((adb)localObject2).wkP)))
            {
              paramm.mXJ = ((adb)localObject2).wkT;
              paramm.nmc = ((adb)localObject2).wkU;
              localObject2 = ((adb)localObject2).wkP.iterator();
              if (((Iterator)localObject2).hasNext())
              {
                localObject3 = r.b.a((add)((Iterator)localObject2).next());
                ((r.b)localObject3).ctj = ((String)localObject1);
                ((r.b)localObject3).nmy.appId = ((r.b)localObject3).appId;
                ((r.b)localObject3).nmy.nmu = ((r.b)localObject3).nmu;
                ((r.b)localObject3).nmy.nmv = ((r.b)localObject3).nmv;
                ((r.b)localObject3).nmy.nmA = "2";
                localObject4 = ((r.b)localObject3).nmy;
                paramInt1 = paramm.nlZ;
                paramm.nlZ = (paramInt1 + 1);
                ((r.c)localObject4).position = (paramInt1 + 301);
                localObject4 = ((r.b)localObject3).nmy;
                if (!paramm.ctn)
                  break label441;
              }
              label441: for (paramInt1 = 1403; ; paramInt1 = 1405)
              {
                ((r.c)localObject4).cKG = paramInt1;
                paramm.kwf.add(localObject3);
                break label284;
                break label214;
                paramString = null;
                break;
              }
            }
            paramm.nmc = false;
          }
        }
        paramm = this.nmM;
        localObject1 = this.nmP;
        if (paramm.kwf == null)
          paramm.kwf = new ArrayList();
        paramm.njD = 0;
        paramm.nlX = 0;
        paramm.nlY = 0;
        paramm.nlZ = 0;
        paramm.nma = 0;
        paramm.ctn = false;
        paramm.nlW = false;
        paramm.nmc = false;
        paramm.mXJ = 0;
        paramm.kwf.clear();
        paramm.nmd = false;
        Object localObject2 = paramString.iterator();
        while (((Iterator)localObject2).hasNext())
        {
          paramString = (adb)((Iterator)localObject2).next();
          label603: label622: int i;
          if ((paramString.wkO == null) || (paramString.wkO.size() == 0))
          {
            paramInt1 = 1;
            if ((paramString.wkP == null) || (paramString.wkP.size() == 0))
            {
              paramInt2 = 1;
              if ((paramString.wkS != null) && (paramString.wkS.size() != 0))
                break label732;
              i = 1;
              label642: if ((paramInt1 == 0) || (paramInt2 == 0) || (i == 0))
                break label738;
              paramInt1 = 1;
              label657: if (paramInt1 == 0)
                break label758;
              if (paramString.type != 1)
                continue;
              if (bo.isNullOrNil((String)localObject1))
                break label743;
            }
          }
          else
          {
            label732: label738: label743: for (paramString = paramm.context.getString(2131300343, new Object[] { localObject1 }); ; paramString = paramm.context.getString(2131300342))
            {
              paramm.kwf.add(r.b.aM(6, paramString));
              paramm.nmd = true;
              break;
              paramInt1 = 0;
              break label603;
              paramInt2 = 0;
              break label622;
              i = 0;
              break label642;
              paramInt1 = 0;
              break label657;
            }
            label758: paramm.kwf.add(r.b.aM(0, paramString.Title));
            if (!paramm.nmd)
            {
              ((r.b)paramm.kwf.get(paramm.kwf.size() - 1)).nmw = true;
              paramm.nmd = true;
            }
            Object localObject5;
            if ((paramString.type == 4) && (paramString.wkS != null))
            {
              localObject4 = paramString.wkS.iterator();
              while (((Iterator)localObject4).hasNext())
              {
                localObject5 = (adc)((Iterator)localObject4).next();
                localObject3 = new r.b();
                ((r.b)localObject3).type = 3;
                ((r.b)localObject3).appId = ((adc)localObject5).wkV.fKh;
                ((r.b)localObject3).name = ((adc)localObject5).wkV.Name;
                ((r.b)localObject3).hHV = ((adc)localObject5).wkV.wbw;
                ((r.b)localObject3).iconUrl = ((adc)localObject5).wkV.IconUrl;
                ((r.b)localObject3).nmq = ((adc)localObject5).wkV.mZt;
                ((r.b)localObject3).nmr = ((adc)localObject5).wkV.wkA;
                ((r.b)localObject3).actionType = ((adc)localObject5).wkV.wkB;
                ((r.b)localObject3).nms = ((adc)localObject5).wkV.wkC;
                ((r.b)localObject3).nmt = ((adc)localObject5).wkW;
                ((r.b)localObject3).nmy = new r.c(((adc)localObject5).wkV.wkB, 4, ((adc)localObject5).wkV.fKh, ((adc)localObject5).wkV.wkC);
                ((r.b)localObject3).ctj = ((String)localObject1);
                ((r.b)localObject3).nmy.nmA = "3";
                localObject5 = ((r.b)localObject3).nmy;
                paramInt1 = paramm.nlY;
                paramm.nlY = (paramInt1 + 1);
                ((r.c)localObject5).position = (paramInt1 + 601);
                paramm.kwf.add(localObject3);
              }
            }
            if (((paramString.type == 1) || (paramString.type == 2)) && (paramString.wkO != null))
            {
              localObject3 = paramString.wkO.iterator();
              if (((Iterator)localObject3).hasNext())
              {
                localObject5 = (acv)((Iterator)localObject3).next();
                localObject4 = new r.b();
                ((r.b)localObject4).type = 1;
                ((r.b)localObject4).appId = ((acv)localObject5).fKh;
                ((r.b)localObject4).name = ((acv)localObject5).Name;
                ((r.b)localObject4).hHV = ((acv)localObject5).wbw;
                ((r.b)localObject4).iconUrl = ((acv)localObject5).IconUrl;
                ((r.b)localObject4).nmq = ((acv)localObject5).mZt;
                ((r.b)localObject4).nmr = ((acv)localObject5).wkA;
                ((r.b)localObject4).actionType = ((acv)localObject5).wkB;
                ((r.b)localObject4).nms = ((acv)localObject5).wkC;
                ((r.b)localObject4).nmy = new r.c(((acv)localObject5).wkB, 1, ((acv)localObject5).fKh, ((acv)localObject5).wkC);
                ((r.b)localObject4).ctj = ((String)localObject1);
                if (paramString.type == 1)
                {
                  paramm.ctn = true;
                  localObject5 = ((r.b)localObject4).nmy;
                  paramInt1 = paramm.njD;
                  paramm.njD = (paramInt1 + 1);
                  ((r.c)localObject5).position = (paramInt1 + 1);
                }
                while (true)
                {
                  ((r.b)localObject4).nmy.nmA = "1";
                  paramm.kwf.add(localObject4);
                  break;
                  if (paramString.type == 2)
                  {
                    paramm.nlW = true;
                    localObject5 = ((r.b)localObject4).nmy;
                    paramInt1 = paramm.nlX;
                    paramm.nlX = (paramInt1 + 1);
                    ((r.c)localObject5).position = (paramInt1 + 1);
                  }
                }
              }
            }
            else if ((paramString.type == 3) && (paramString.wkP != null))
            {
              paramm.mXJ = paramString.wkT;
              paramm.nmc = paramString.wkU;
              localObject4 = paramString.wkP.iterator();
              while (((Iterator)localObject4).hasNext())
              {
                localObject3 = r.b.a((add)((Iterator)localObject4).next());
                ((r.b)localObject3).ctj = ((String)localObject1);
                ((r.b)localObject3).nmy.appId = ((r.b)localObject3).appId;
                ((r.b)localObject3).nmy.nmu = ((r.b)localObject3).nmu;
                ((r.b)localObject3).nmy.nmv = ((r.b)localObject3).nmv;
                ((r.b)localObject3).nmy.nmA = "2";
                localObject5 = ((r.b)localObject3).nmy;
                paramInt1 = paramm.nlZ;
                paramm.nlZ = (paramInt1 + 1);
                ((r.c)localObject5).position = (paramInt1 + 301);
                paramm.kwf.add(localObject3);
              }
            }
            if ((!bo.isNullOrNil(paramString.wkQ)) && (!bo.isNullOrNil(paramString.wkR)) && (paramString.type == 1))
            {
              localObject3 = paramString.wkQ;
              paramString = paramString.wkR;
              localObject4 = new r.b();
              ((r.b)localObject4).type = 5;
              ((r.b)localObject4).name = ((String)localObject3);
              ((r.b)localObject4).nmy = new r.c(paramString);
              ((r.b)localObject4).nmy.appId = "wx62d9035fd4fd2059";
              ((r.b)localObject4).nmy.nmA = "1";
              ((r.b)localObject4).nmy.position = 300;
              paramm.kwf.add(localObject4);
            }
          }
        }
        localObject1 = paramm.kwf.iterator();
        while (((Iterator)localObject1).hasNext())
        {
          paramString = (r.b)((Iterator)localObject1).next();
          if (paramm.ctn)
            paramString.nmy.cKG = 1403;
          else if (paramm.nlW)
            paramString.nmy.cKG = 1404;
          else
            paramString.nmy.cKG = 1405;
        }
        paramm.notifyDataSetChanged();
      }
      label1768: ru(2);
      AppMethodBeat.o(112202);
      break;
      if ((paramInt1 != 0) || (paramInt2 != 0))
      {
        AppMethodBeat.o(112202);
        break;
      }
      paramString = ((al)paramm).ctj;
      Object localObject1 = ((acx)((al)paramm).lty.fsH.fsP).Title;
      paramm = ((acx)((al)paramm).lty.fsH.fsP).wkJ;
      this.nmN.b(paramString, (String)localObject1, paramm);
      ru(5);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  public final boolean vN(String paramString)
  {
    AppMethodBeat.i(112208);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(112208);
    while (true)
    {
      return true;
      LinkedList localLinkedList = new LinkedList();
      paramString = nmI.split(paramString.replace('*', ' '));
      for (int i = 0; i < paramString.length; i++)
        localLinkedList.add(paramString[i]);
      aa(localLinkedList);
      ru(1);
      AppMethodBeat.o(112208);
    }
  }

  public final void vO(String paramString)
  {
    AppMethodBeat.i(112207);
    if (this.nmT)
    {
      this.nmT = false;
      AppMethodBeat.o(112207);
    }
    while (true)
    {
      return;
      if ((this.nmR != null) && (this.nmR.equals(bo.nullAsNil(paramString))))
      {
        ab.d("MicroMsg.GameSearchUI", "repeat searchChange");
        AppMethodBeat.o(112207);
      }
      else
      {
        this.nmR = paramString;
        if (bo.isNullOrNil(paramString))
        {
          while (!this.nmS.isEmpty())
          {
            g.RQ();
            g.RO().eJo.c((m)this.nmS.pop());
          }
          paramString = new al(aa.dor(), paramString, e.bDR());
          g.Rg().a(paramString, 0);
          this.nmS.add(paramString);
          AppMethodBeat.o(112207);
        }
        else
        {
          LinkedList localLinkedList = new LinkedList();
          paramString = nmI.split(paramString.replace('*', ' '));
          for (int i = 0; i < paramString.length; i++)
            localLinkedList.add(paramString[i]);
          aa(localLinkedList);
          ru(6);
          AppMethodBeat.o(112207);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.GameSearchUI
 * JD-Core Version:    0.6.2
 */