package com.tencent.mm.ui;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.b;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.widget.ProgressBar;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.aw;
import com.tencent.mm.modelsimple.w;
import com.tencent.mm.modelvoice.n;
import com.tencent.mm.protocal.protobuf.bre;
import com.tencent.mm.protocal.protobuf.bxz;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi.d;
import com.tencent.mm.ui.widget.b.a;
import java.util.Iterator;
import java.util.LinkedList;

public class AllRemindMsgUI extends MMActivity
  implements com.tencent.mm.ai.f
{
  private static final com.tencent.mm.a.f<Integer, com.tencent.mm.protocal.b.a.c> emX;
  private RecyclerView aiB;
  private ProgressBar gHA;
  private LinkedList<AllRemindMsgUI.d> kip;
  private View yeu;
  private AllRemindMsgUI.b yev;
  private AllRemindMsgUI.a yew;

  static
  {
    AppMethodBeat.i(29136);
    emX = new com.tencent.mm.memory.a.c(32);
    AppMethodBeat.o(29136);
  }

  public AllRemindMsgUI()
  {
    AppMethodBeat.i(29129);
    this.yew = new AllRemindMsgUI.a(this);
    AppMethodBeat.o(29129);
  }

  public static String a(Context paramContext, int paramInt1, String paramString, int paramInt2)
  {
    AppMethodBeat.i(29135);
    String str = "";
    Object localObject = j.b.me(paramString);
    switch (paramInt1)
    {
    default:
      localObject = paramContext.getString(2131301736);
    case 1:
    case 34:
    case 3:
    case 23:
    case 33:
    case 43:
    case 62:
    case 48:
    case 42:
    case 66:
    case 49:
    case 553648177:
    case 587202609:
    case 47:
    case 419430449:
    case 436207665:
    case 469762097:
    case 503316529:
    case 369098801:
    case 452984881:
    case 520093745:
    case -1879048185:
    case -1879048183:
    case -1879048176:
    case -1879048186:
    case 37:
    }
    while (true)
    {
      label244: AppMethodBeat.o(29135);
      while (true)
      {
        return localObject;
        localObject = paramContext.getString(2131296591);
        break label244;
        localObject = paramContext.getString(2131302210, new Object[] { Integer.valueOf((int)com.tencent.mm.modelvoice.q.fY(new n(paramString).time)) });
        break label244;
        localObject = paramContext.getString(2131297012);
        break label244;
        if (62 == paramInt1);
        for (paramInt1 = 2131297051; ; paramInt1 = 2131297076)
        {
          localObject = paramContext.getString(paramInt1);
          break;
        }
        aw.ZK();
        com.tencent.mm.model.c.XO().Ro(paramString);
        localObject = paramContext.getString(2131302202, new Object[] { "" });
        break label244;
        localObject = paramContext.getString(2131296947);
        break label244;
        if (localObject == null)
        {
          ab.e("MicroMsg.emoji.AllRemindMsgUI", "decode msg content failed");
          localObject = "";
          AppMethodBeat.o(29135);
        }
        else
        {
          switch (((j.b)localObject).type)
          {
          default:
            ab.i("MicroMsg.emoji.AllRemindMsgUI", "default type:%s", new Object[] { Integer.valueOf(((j.b)localObject).type) });
            break;
          case 33:
            localObject = paramContext.getString(2131296591);
            break;
          case 6:
            localObject = paramContext.getString(2131302201, new Object[] { ((j.b)localObject).title });
            break;
          case 5:
          case 7:
            localObject = paramContext.getString(2131302208, new Object[] { "" });
            break;
          case 8:
            localObject = paramContext.getString(2131296896);
            break;
          case 15:
          case 26:
          case 27:
            localObject = paramContext.getString(2131296895);
            break;
          case 25:
            localObject = paramContext.getString(2131296883);
            break;
          case 17:
            localObject = paramContext.getString(2131302202, new Object[] { "" });
            break;
          case 19:
            localObject = paramContext.getString(2131302205, new Object[] { "" });
            break;
          case 24:
            localObject = paramContext.getString(2131302204, new Object[] { "" });
            break;
          case 3:
            localObject = paramContext.getString(2131302203, new Object[] { "" });
            break;
          case 4:
            localObject = paramContext.getString(2131302209, new Object[] { "" });
            break;
          case 2:
            localObject = paramContext.getString(2131297012);
            break;
          case 44:
            if (bo.isNullOrNil(((j.b)localObject).p(paramContext, true)))
              break;
            localObject = ((j.b)localObject).p(paramContext, true) + " " + ((j.b)localObject).title;
            break label244;
            localObject = paramContext.getString(2131296895);
            break label244;
            localObject = paramContext.getString(2131302206);
            break label244;
            if (localObject == null)
            {
              ab.e("MicroMsg.emoji.AllRemindMsgUI", "decode msg content failed");
              localObject = "";
              AppMethodBeat.o(29135);
            }
            else
            {
              if (paramInt2 == 1)
              {
                localObject = paramContext.getString(2131302198, new Object[] { ((j.b)localObject).fhW, "" });
                break label244;
              }
              localObject = paramContext.getString(2131302198, new Object[] { ((j.b)localObject).fhW, "" });
              break label244;
              if (localObject != null)
                break label955;
              ab.e("MicroMsg.emoji.AllRemindMsgUI", "decode msg content failed");
              localObject = "";
              AppMethodBeat.o(29135);
            }
            break;
          }
        }
      }
      label955: localObject = paramContext.getString(2131302198, new Object[] { ((j.b)localObject).fhW, "" });
      continue;
      localObject = paramContext.getString(2131302199, new Object[] { "" });
      continue;
      localObject = paramContext.getString(2131302199, new Object[] { "" });
      continue;
      localObject = paramContext.getString(2131302197, new Object[] { "" });
      continue;
      localObject = paramContext.getString(2131302207, new Object[] { "" });
      continue;
      localObject = str;
      if (paramString != null)
      {
        localObject = str;
        if (paramString.length() > 0)
        {
          paramString = bi.d.apF(paramString);
          localObject = str;
          if (paramString.svN != null)
          {
            localObject = str;
            if (paramString.svN.length() > 0)
              switch (paramString.scene)
              {
              case 19:
              case 20:
              case 21:
              default:
                localObject = paramContext.getString(2131300013, new Object[] { paramString.getDisplayName() });
                break;
              case 18:
                localObject = paramContext.getString(2131299994, new Object[] { paramString.getDisplayName() });
                break;
              case 22:
              case 23:
              case 24:
              case 26:
              case 27:
              case 28:
              case 29:
                localObject = paramContext.getString(2131300004, new Object[] { paramString.getDisplayName() });
                break;
              case 25:
                localObject = paramContext.getString(2131299926, new Object[] { paramString.getDisplayName() });
              }
          }
        }
      }
    }
  }

  protected final int getLayoutId()
  {
    return 2130968647;
  }

  protected final void initView()
  {
    AppMethodBeat.i(29132);
    setMMTitle(2131302356);
    this.aiB = ((RecyclerView)findViewById(2131821098));
    this.gHA = ((ProgressBar)findViewById(2131821099));
    this.yeu = findViewById(2131821100);
    this.aiB.setVisibility(8);
    this.aiB.setLayoutManager(new LinearLayoutManager());
    this.yev = new AllRemindMsgUI.b(this);
    this.aiB.setAdapter(this.yev);
    this.yev.a(new AllRemindMsgUI.1(this));
    setBackBtn(new AllRemindMsgUI.2(this));
    AppMethodBeat.o(29132);
  }

  public void onBackPressed()
  {
    AppMethodBeat.i(29133);
    finish();
    AppMethodBeat.o(29133);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(29130);
    super.onCreate(paramBundle);
    aw.Rg().a(866, this.yew);
    aw.Rg().a(525, this);
    com.tencent.mm.plugin.report.service.h.pYm.a(795L, 3L, 1L, false);
    initView();
    d.post(new AllRemindMsgUI.a(this), "load remind data!");
    AppMethodBeat.o(29130);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(29131);
    super.onDestroy();
    aw.Rg().b(866, this.yew);
    aw.Rg().b(525, this);
    AppMethodBeat.o(29131);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(29134);
    ab.i("MicroMsg.emoji.AllRemindMsgUI", "[onSceneEnd] errType:%s,errCode:%s,errMsg:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if ((paramInt1 == 0) && (paramInt2 == 0))
      if (paramm.getType() != 525)
        AppMethodBeat.o(29134);
    while (true)
    {
      return;
      paramString = (bxz)((w)paramm).fAT.fsG.fsP;
      paramm = this.kip.listIterator();
      while (paramm.hasNext())
        if (((AllRemindMsgUI.d)paramm.next()).yeF == paramString.wXC.wTy)
          paramm.remove();
      this.yev.aop.notifyChanged();
      AppMethodBeat.o(29134);
      continue;
      Toast.makeText(this.mController.ylL, bo.bc(paramString, getString(2131301843)), 0).show();
      AppMethodBeat.o(29134);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.AllRemindMsgUI
 * JD-Core Version:    0.6.2
 */