package com.tencent.mm.plugin.sns.ui;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AbsListView.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.bp.d;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.label.a.a;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.v;
import com.tencent.mm.plugin.sns.model.x;
import com.tencent.mm.plugin.sns.storage.t;
import com.tencent.mm.plugin.sns.storage.u;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.q.b;
import com.tencent.mm.ui.widget.listview.AnimatedExpandableListView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class SnsLabelUI extends MMActivity
  implements f
{
  public static int[] rth = { 2131303680, 2131303678, 2131303674, 2131303667 };
  private AnimatedExpandableListView rtg;
  private ArrayList<String> rti;
  private String rtj;
  private String rtk;
  ap rtl;
  private int rtm = 0;
  private boolean rtn;
  private boolean rto = false;
  private boolean rtp = false;
  private boolean rtq = false;
  private int rtr;
  private com.tencent.mm.ui.base.p rts;
  private String rtt;
  private int rtu;
  private ArrayList<String> rtv;
  private ArrayList<String> rtw;
  private ArrayList<Long> rtx;
  private ArrayList<String[]> rty;

  private void ctA()
  {
    AppMethodBeat.i(39039);
    if ((this.rti == null) || (this.rti.isEmpty()))
    {
      this.rtj = "";
      AppMethodBeat.o(39039);
    }
    while (true)
    {
      return;
      ArrayList localArrayList1 = new ArrayList();
      if (this.rtj != null)
      {
        ArrayList localArrayList2 = bo.P(this.rtj.split(","));
        if (localArrayList2 != null)
        {
          Iterator localIterator = localArrayList2.iterator();
          while (localIterator.hasNext())
          {
            String str = (String)localIterator.next();
            if (!this.rti.contains(str))
              localArrayList1.add(str);
          }
          localArrayList2.removeAll(localArrayList1);
          this.rtj = bo.c(localArrayList2, ",");
        }
      }
      AppMethodBeat.o(39039);
    }
  }

  private boolean ctt()
  {
    boolean bool1 = true;
    AppMethodBeat.i(39027);
    int i = this.rtl.rtF;
    boolean bool2;
    if (this.rtl.rtF != this.rtm)
      if (i == 2)
      {
        bool2 = bool1;
        if (this.rtl.rtH.size() == 0)
        {
          bool2 = bool1;
          if (this.rtl.rtJ.size() != 0);
        }
      }
      else
      {
        if (i != 3)
          break label106;
        bool2 = bool1;
        if (this.rtl.rtI.size() == 0)
        {
          if (this.rtl.rtK.size() == 0)
            break label106;
          bool2 = bool1;
        }
      }
    while (true)
    {
      AppMethodBeat.o(39027);
      return bool2;
      label106: bool2 = bool1;
      if (i != 1)
      {
        bool2 = bool1;
        if (i != 0)
        {
          do
          {
            do
            {
              bool2 = false;
              break;
              if ((i == 2) && (this.rtl.rtH.size() != 0))
              {
                bool2 = bool1;
                if (!bo.c(this.rtl.rtH, ",").equals(this.rtj))
                  break;
                bool2 = bool1;
                if (!bo.c(this.rtl.rtJ, ",").equals(this.rtk))
                  break;
              }
            }
            while ((i != 3) || (this.rtl.rtI.size() == 0));
            bool2 = bool1;
            if (!bo.c(this.rtl.rtI, ",").equals(this.rtj))
              break;
          }
          while (bo.c(this.rtl.rtK, ",").equals(this.rtk));
          bool2 = bool1;
        }
      }
    }
  }

  private void ctu()
  {
    AppMethodBeat.i(39029);
    Intent localIntent = new Intent();
    localIntent.putExtra("Ktag_range_index", this.rtm);
    if ((this.rtm == 2) || (this.rtm == 3))
    {
      ctA();
      localIntent.putExtra("Klabel_name_list", this.rtj);
      localIntent.putExtra("Kother_user_name_list", this.rtk);
    }
    setResult(-1, localIntent);
    finish();
    AppMethodBeat.o(39029);
  }

  private static int ctw()
  {
    AppMethodBeat.i(39034);
    g.RQ();
    int i = ((Integer)g.RP().Ry().get(335874, Integer.valueOf(0))).intValue();
    AppMethodBeat.o(39034);
    return i;
  }

  private static void ctx()
  {
    AppMethodBeat.i(39035);
    g.RQ();
    int i = ((Integer)g.RP().Ry().get(335874, Integer.valueOf(0))).intValue();
    g.RQ();
    g.RP().Ry().set(335874, Integer.valueOf(i + 1));
    AppMethodBeat.o(39035);
  }

  private void cty()
  {
    AppMethodBeat.i(39036);
    com.tencent.mm.plugin.report.service.h.pYm.e(11455, new Object[] { "", "", Integer.valueOf(this.rtu), Integer.valueOf(0) });
    ctx();
    this.rtw = null;
    this.rtq = false;
    this.rtp = false;
    if ((this.rts != null) && (this.rts.isShowing()))
      this.rts.dismiss();
    if (this.rto)
    {
      this.rto = false;
      AppMethodBeat.o(39036);
    }
    while (true)
    {
      return;
      int i = 2131303685;
      if (ctw() > 1)
        i = 2131303684;
      com.tencent.mm.ui.base.h.a(this, i, 2131296994, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
        }
      });
      AppMethodBeat.o(39036);
    }
  }

  private void ctz()
  {
    AppMethodBeat.i(39038);
    if ((this.rti == null) || (this.rti.isEmpty()))
    {
      if (this.rtl.rtH != null)
        this.rtl.rtH.clear();
      if (this.rtl.rtI != null)
        this.rtl.rtI.clear();
      AppMethodBeat.o(39038);
    }
    while (true)
    {
      return;
      ArrayList localArrayList = new ArrayList();
      Object localObject1;
      Object localObject2;
      if ((this.rtm == 2) && (this.rtl.rtH != null))
      {
        localObject1 = this.rtl.rtH.iterator();
        while (((Iterator)localObject1).hasNext())
        {
          localObject2 = (String)((Iterator)localObject1).next();
          if (!this.rti.contains(localObject2))
            localArrayList.add(localObject2);
        }
        this.rtl.rtH.removeAll(localArrayList);
        AppMethodBeat.o(39038);
      }
      else
      {
        if (this.rtm == 3)
        {
          localObject2 = this.rtl.rtI.iterator();
          while (((Iterator)localObject2).hasNext())
          {
            localObject1 = (String)((Iterator)localObject2).next();
            if (!this.rti.contains(localObject1))
              localArrayList.add(localObject1);
          }
          this.rtl.rtI.removeAll(localArrayList);
        }
        AppMethodBeat.o(39038);
      }
    }
  }

  private void ds(List<String[]> paramList)
  {
    AppMethodBeat.i(39037);
    if ((this.rtw == null) || (this.rtw.size() == 0))
      AppMethodBeat.o(39037);
    while (true)
    {
      return;
      Iterator localIterator1 = this.rtw.iterator();
      Iterator localIterator2 = paramList.iterator();
      ArrayList localArrayList = new ArrayList(this.rtw.size());
      paramList = new ArrayList(this.rtw.size());
      while (localIterator1.hasNext())
      {
        localArrayList.add(a.bJa().PE((String)localIterator1.next()));
        paramList.add(bo.c(Arrays.asList((Object[])localIterator2.next()), ","));
        this.rtp = true;
      }
      a.bJa().i(localArrayList, paramList);
      AppMethodBeat.o(39037);
    }
  }

  private void goBack()
  {
    AppMethodBeat.i(39028);
    if (ctt())
    {
      com.tencent.mm.ui.base.h.a(this, true, getString(2131303673), "", getString(2131303672), getString(2131303671), new SnsLabelUI.11(this), new SnsLabelUI.12(this));
      AppMethodBeat.o(39028);
    }
    while (true)
    {
      return;
      ctu();
      AppMethodBeat.o(39028);
    }
  }

  final void ctv()
  {
    AppMethodBeat.i(39030);
    Intent localIntent = new Intent();
    if (this.rtl.rtF == 2)
    {
      this.rtj = bo.c(this.rtl.rtH, ",");
      this.rtk = bo.c(this.rtl.rtJ, ",");
      ctA();
      localIntent.putExtra("Klabel_name_list", this.rtj);
      localIntent.putExtra("Kother_user_name_list", this.rtk);
    }
    while (true)
    {
      localIntent.putExtra("Ktag_range_index", this.rtl.rtF);
      setResult(-1, localIntent);
      finish();
      AppMethodBeat.o(39030);
      return;
      if (this.rtl.rtF == 3)
      {
        this.rtj = bo.c(this.rtl.rtI, ",");
        this.rtk = bo.c(this.rtl.rtK, ",");
        ctA();
        localIntent.putExtra("Klabel_name_list", this.rtj);
        localIntent.putExtra("Kother_user_name_list", this.rtk);
      }
    }
  }

  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(39023);
    boolean bool;
    if ((paramKeyEvent.getKeyCode() == 4) && (paramKeyEvent.getAction() == 0))
    {
      goBack();
      bool = true;
      AppMethodBeat.o(39023);
    }
    while (true)
    {
      return bool;
      bool = super.dispatchKeyEvent(paramKeyEvent);
      AppMethodBeat.o(39023);
    }
  }

  public final int getLayoutId()
  {
    return 2130970767;
  }

  public final void initView()
  {
    AppMethodBeat.i(39025);
    boolean bool = getIntent().getBooleanExtra("KLabel_is_filter_private", false);
    this.rtg = ((AnimatedExpandableListView)findViewById(2131827785));
    this.rti = ((ArrayList)a.bJa().bIV());
    this.rtl.rtG = bool;
    this.rtl.T(this.rti);
    ctz();
    AbsListView.LayoutParams localLayoutParams = new AbsListView.LayoutParams(-1, -2);
    localLayoutParams.height = getResources().getDimensionPixelSize(2131427779);
    View localView = new View(this);
    localView.setLayoutParams(localLayoutParams);
    this.rtg.addHeaderView(localView);
    this.rtg.setAdapter(this.rtl);
    if (this.rtl.rtF == 2)
      this.rtg.expandGroup(2);
    while (true)
    {
      this.rtg.setOnGroupClickListener(new SnsLabelUI.5(this));
      this.rtg.setOnChildClickListener(new SnsLabelUI.6(this));
      setBackBtn(new SnsLabelUI.7(this));
      a(0, getString(2131303669), new SnsLabelUI.8(this), q.b.ymu);
      AppMethodBeat.o(39025);
      return;
      if (this.rtl.rtF == 3)
        this.rtg.expandGroup(3);
    }
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(39026);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    Object localObject;
    if ((paramInt2 == -1) && (paramInt1 == 4003))
    {
      ab.i("MicroMsg.SnsLabelUI", "the Activity completed");
      localObject = paramIntent.getStringExtra("Select_Contacts_To_Create_New_Label");
      if (!bo.isNullOrNil((String)localObject))
      {
        paramIntent = new Intent();
        paramIntent.putExtra("Select_Contact", (String)localObject);
        d.b(this.mController.ylL, "label", ".ui.ContactLabelEditUI", paramIntent, 4002);
        AppMethodBeat.o(39026);
      }
    }
    while (true)
    {
      return;
      paramIntent = paramIntent.getStringExtra("Select_Contact");
      this.rtk = new String(paramIntent);
      ab.i("MicroMsg.SnsLabelUI", "dz[onActivityResult] %s", new Object[] { String.valueOf(paramIntent) });
      if (this.rtr == 2)
      {
        this.rtl.rtJ.clear();
        if (!bo.isNullOrNil(paramIntent))
        {
          paramIntent = bo.P(paramIntent.split(","));
          this.rtl.rtJ.addAll(paramIntent);
          this.rtl.rtF = this.rtr;
        }
      }
      while (true)
      {
        this.rtl.notifyDataSetChanged();
        this.rtg.expandGroup(this.rtr);
        AppMethodBeat.o(39026);
        break;
        if (this.rtr == 3)
        {
          this.rtl.rtK.clear();
          if (!bo.isNullOrNil(paramIntent))
          {
            paramIntent = bo.P(paramIntent.split(","));
            this.rtl.rtK.addAll(paramIntent);
            this.rtl.rtF = this.rtr;
          }
        }
      }
      if ((paramInt2 == -1) && (paramInt1 == 4001))
      {
        paramIntent = paramIntent.getStringExtra("Select_Contact");
        ab.i("MicroMsg.SnsLabelUI", "dz[onActivityResult] %s", new Object[] { String.valueOf(paramIntent) });
        if (!bo.isNullOrNil(paramIntent))
        {
          localObject = new Intent();
          ((Intent)localObject).putExtra("Select_Contact", paramIntent);
          d.b(this, "label", ".ui.ContactLabelEditUI", (Intent)localObject, 4002);
        }
        AppMethodBeat.o(39026);
      }
      else
      {
        if ((paramInt2 == 0) && (paramInt1 == 4002) && (paramIntent != null))
        {
          localObject = paramIntent.getStringExtra("k_sns_label_add_label");
          this.rtt = paramIntent.getStringExtra("k_sns_label_add_label");
          this.rtg.postDelayed(new SnsLabelUI.10(this, (String)localObject), 600L);
        }
        AppMethodBeat.o(39026);
      }
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(39024);
    super.onCreate(paramBundle);
    setMMTitle(2131303812);
    g.RQ();
    g.RO().eJo.a(292, this);
    g.RQ();
    g.RO().eJo.a(635, this);
    g.RQ();
    g.RO().eJo.a(638, this);
    g.RQ();
    g.RO().eJo.a(290, this);
    this.rtl = new ap(this);
    this.rtl.rtL = new SnsLabelUI.1(this);
    paramBundle = getIntent();
    if (paramBundle == null)
    {
      this.rtm = 0;
      this.rtl.style = 0;
      this.rtj = null;
      this.rtk = null;
      this.rtl.rtF = this.rtm;
      if (this.rtl.style == 1)
        findViewById(2131827784).setBackgroundResource(2131689761);
      if (this.rtm != 2)
        break label413;
      if (!TextUtils.isEmpty(this.rtj))
        this.rtl.rtH = bo.P(this.rtj.split(","));
      if (!TextUtils.isEmpty(this.rtk))
        this.rtl.rtJ = bo.P(this.rtk.split(","));
    }
    while (true)
    {
      g.RQ();
      this.rtn = ((Boolean)g.RP().Ry().get(335873, Boolean.TRUE)).booleanValue();
      if (this.rtn)
      {
        this.rtp = true;
        this.rtq = true;
        if (ctw() > 0)
          this.rto = true;
        g.RQ();
        g.RO().eJo.a(new v(1), 0);
      }
      initView();
      AppMethodBeat.o(39024);
      return;
      this.rtm = paramBundle.getIntExtra("KLabel_range_index", 0);
      this.rtl.style = paramBundle.getIntExtra("k_sns_label_ui_style", 0);
      this.rtj = paramBundle.getStringExtra("Klabel_name_list");
      this.rtk = paramBundle.getStringExtra("Kother_user_name_list");
      if (TextUtils.isEmpty(paramBundle.getStringExtra("k_sns_label_ui_title")))
        break;
      setMMTitle(paramBundle.getStringExtra("k_sns_label_ui_title"));
      break;
      label413: if (this.rtm == 3)
      {
        if (!TextUtils.isEmpty(this.rtj))
          this.rtl.rtI = bo.P(this.rtj.split(","));
        if (!TextUtils.isEmpty(this.rtk))
          this.rtl.rtK = bo.P(this.rtk.split(","));
      }
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(39031);
    g.RQ();
    g.RO().eJo.b(292, this);
    g.RQ();
    g.RO().eJo.b(635, this);
    g.RQ();
    g.RO().eJo.b(638, this);
    g.RQ();
    g.RO().eJo.b(290, this);
    super.onDestroy();
    AppMethodBeat.o(39031);
  }

  public void onResume()
  {
    AppMethodBeat.i(39032);
    if ((this.rtl != null) && (this.rtt == null) && (this.rtg != null))
      this.rtg.postDelayed(new SnsLabelUI.2(this), 600L);
    super.onResume();
    AppMethodBeat.o(39032);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(39033);
    ab.i("MicroMsg.SnsLabelUI", "dz:[onSceneEnd]errType:%d errCode:%d errMsg:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if (!this.rtp)
    {
      AppMethodBeat.o(39033);
      return;
    }
    switch (paramm.getType())
    {
    default:
    case 292:
    case 635:
    case 638:
    case 290:
    }
    while (true)
    {
      AppMethodBeat.o(39033);
      break;
      Object localObject;
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        Cursor localCursor = af.cnL().getCursor();
        this.rtu = localCursor.getCount();
        if (this.rtu > 0)
        {
          localCursor.moveToFirst();
          localObject = new t();
          paramInt1 = localCursor.getCount();
          this.rtw = new ArrayList(paramInt1);
          this.rtv = new ArrayList(paramInt1);
          this.rty = new ArrayList(paramInt1);
          this.rtx = new ArrayList(paramInt1);
          if (!localCursor.isAfterLast())
          {
            ((t)localObject).d(localCursor);
            if ((((t)localObject).field_memberList != null) && (((t)localObject).field_memberList.length() != 0))
            {
              this.rty.add(((t)localObject).field_memberList.split(","));
              paramm = ((t)localObject).field_tagName;
              ArrayList localArrayList = this.rtw;
              paramString = a.bJa().bIX();
              if (paramString == null)
              {
                paramString = paramm;
                label299: localArrayList.add(paramString);
                this.rtv.add(paramm);
                this.rtx.add(Long.valueOf(((t)localObject).field_tagId));
              }
            }
            while (true)
            {
              localCursor.moveToNext();
              break;
              if (!paramString.contains(paramm))
              {
                paramString = paramm;
                break label299;
              }
              paramString = String.format(getString(2131303670), new Object[] { paramm });
              break label299;
              ab.e("MicroMsg.SnsLabelUI", "dz:snstaginfo memberlist is null.");
            }
          }
          localCursor.close();
          if (this.rtv.size() != 0)
            break label512;
          paramInt1 = 0;
          label414: if (paramInt1 != 0);
        }
        else if (this.rtq)
        {
          this.rtl.rtF = this.rtr;
          this.rtg.Qi(this.rtr);
          g.RQ();
          g.RP().Ry().set(335873, Boolean.FALSE);
        }
        localCursor.close();
        if (this.rto)
        {
          this.rtp = true;
          a.bJa().ce(this.rtw);
        }
      }
      while (true)
      {
        this.rtq = false;
        AppMethodBeat.o(39033);
        break;
        label512: paramInt1 = 1;
        break label414;
        this.rtp = false;
        continue;
        cty();
        ab.i("MicroMsg.SnsLabelUI", "dz: error at get sns tag list!");
      }
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        ds(this.rty);
        AppMethodBeat.o(39033);
        break;
      }
      cty();
      ab.i("MicroMsg.SnsLabelUI", "dz: error at add contact label!");
      AppMethodBeat.o(39033);
      break;
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        localObject = this.rtv.iterator();
        paramString = this.rtx.iterator();
        while (((Iterator)localObject).hasNext())
        {
          long l = ((Long)paramString.next()).longValue();
          paramm = (String)((Iterator)localObject).next();
          if (l != 0L)
          {
            g.RQ();
            g.RO().eJo.a(new x(l, paramm), 0);
          }
        }
        g.RQ();
        g.RP().Ry().set(335874, Integer.valueOf(0));
        this.rti = ((ArrayList)a.bJa().bIV());
        paramString = com.tencent.mm.plugin.report.service.h.pYm;
        paramInt2 = this.rtu;
        if (this.rtw == null);
        for (paramInt1 = 0; ; paramInt1 = this.rtw.size())
        {
          paramString.e(11455, new Object[] { "", "", Integer.valueOf(paramInt2), Integer.valueOf(paramInt1) });
          this.rtg.postDelayed(new SnsLabelUI.3(this), 600L);
          g.RQ();
          g.RP().Ry().set(335873, Boolean.FALSE);
          AppMethodBeat.o(39033);
          break;
        }
      }
      cty();
      ab.i("MicroMsg.SnsLabelUI", "dz: error at modify label list!");
      AppMethodBeat.o(39033);
      break;
      if ((paramInt1 != 0) || (paramInt2 != 0))
        ab.i("MicroMsg.SnsLabelUI", "dz: error at delete tag list!");
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsLabelUI
 * JD-Core Version:    0.6.2
 */