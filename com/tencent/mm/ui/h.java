package com.tencent.mm.ui;

import android.app.ProgressDialog;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.g.a.be;
import com.tencent.mm.g.a.ij.a;
import com.tencent.mm.plugin.account.ui.RegByMobileSetPwdUI;
import com.tencent.mm.protocal.b.a.a;
import com.tencent.mm.protocal.b.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.LinkedList;

public final class h
{
  int cur;
  ProgressDialog ehJ;
  com.tencent.mm.ui.widget.a.c gup;
  EditText qmA;
  boolean qmB;
  private View qmy;
  private TextView qmz;
  MMFragmentActivity yhZ;
  LauncherUI.b yia;
  ij.a yib;
  f yic;
  boolean yid;
  boolean yie;
  com.tencent.mm.sdk.b.c yif;
  com.tencent.mm.sdk.b.c<be> yig;

  public h(MMFragmentActivity paramMMFragmentActivity, LauncherUI.b paramb)
  {
    AppMethodBeat.i(29327);
    this.yib = null;
    this.yid = false;
    this.yie = false;
    this.yif = new h.1(this);
    this.cur = 0;
    this.yig = new h.2(this);
    this.yhZ = paramMMFragmentActivity;
    this.yia = paramb;
    AppMethodBeat.o(29327);
  }

  final boolean a(ij.a parama)
  {
    AppMethodBeat.i(29328);
    boolean bool;
    if ((parama == null) || (parama.cDw == null) || (parama.cDw.vzI == null) || (parama.cDw.vzI.size() == 0))
    {
      bool = false;
      AppMethodBeat.o(29328);
      return bool;
    }
    int i = parama.cDw.id;
    String str1 = parama.cDw.title;
    String str2 = parama.cDw.bzH;
    int j = parama.type;
    int k = parama.cDw.vzI.size();
    if (j == 0)
      if (k == 1)
      {
        parama = (a)parama.cDw.vzI.get(0);
        ab.i("MicroMsg.LauncherUI.GlobalAlertMgr", "summeralert id[%d], title[%s], msg[%s], id[%d], action[%d], btnstr[%s], btnurl[%s]", new Object[] { Integer.valueOf(i), str1, str2, Integer.valueOf(parama.id), Integer.valueOf(parama.actionType), parama.vzG, parama.vzH });
        com.tencent.mm.ui.base.h.a(this.yhZ, str2, str1, parama.vzG, false, new h.7(this, i, parama));
      }
    while (true)
    {
      bool = true;
      AppMethodBeat.o(29328);
      break;
      a locala1 = (a)parama.cDw.vzI.get(1);
      parama = (a)parama.cDw.vzI.get(0);
      ab.i("MicroMsg.LauncherUI.GlobalAlertMgr", "summeralert title[%s], msg[%s], id1[%d], action1[%d], btnstr1[%s],btnurl1[%s], id2[%d], action2[%d], btnstr2[%s], btnurl2[%s]", new Object[] { str1, str2, Integer.valueOf(locala1.id), Integer.valueOf(locala1.actionType), locala1.vzG, locala1.vzH, Integer.valueOf(parama.id), Integer.valueOf(parama.actionType), parama.vzG, parama.vzH });
      com.tencent.mm.ui.base.h.a(this.yhZ, str2, str1, locala1.vzG, parama.vzG, false, new h.8(this, i, locala1), new h.9(this, i, parama));
      continue;
      if (j == 1)
      {
        a locala2 = (a)parama.cDw.vzI.get(0);
        locala1 = (a)parama.cDw.vzI.get(1);
        com.tencent.mm.ui.base.h.a(this.yhZ, str2, str1, locala2.vzG, locala1.vzG, false, parama.cDx, parama.cDy);
      }
    }
  }

  final f dxf()
  {
    AppMethodBeat.i(29329);
    if (this.yic == null)
      this.yic = new h.11(this);
    f localf = this.yic;
    AppMethodBeat.o(29329);
    return localf;
  }

  final void dxg()
  {
    AppMethodBeat.i(29331);
    if (this.gup != null)
    {
      this.gup.show();
      AppMethodBeat.o(29331);
    }
    while (true)
    {
      return;
      if (this.qmy == null)
      {
        this.qmy = View.inflate(this.yhZ, 2130970617, null);
        this.qmz = ((TextView)this.qmy.findViewById(2131827352));
        this.qmz.setText(getString(2131303108));
        this.qmA = ((EditText)this.qmy.findViewById(2131827353));
        this.qmA.setInputType(129);
      }
      this.gup = com.tencent.mm.ui.base.h.a(this.yhZ, null, this.qmy, new h.12(this), new h.13(this));
      AppMethodBeat.o(29331);
    }
  }

  final String getString(int paramInt)
  {
    AppMethodBeat.i(29332);
    String str = this.yhZ.getString(paramInt);
    AppMethodBeat.o(29332);
    return str;
  }

  final void pF(boolean paramBoolean)
  {
    AppMethodBeat.i(29330);
    ab.d("MicroMsg.LauncherUI.GlobalAlertMgr", "summeralert handlePassword ".concat(String.valueOf(paramBoolean)));
    if (paramBoolean)
    {
      dxg();
      AppMethodBeat.o(29330);
    }
    while (true)
    {
      return;
      Intent localIntent = new Intent(this.yhZ, RegByMobileSetPwdUI.class);
      localIntent.putExtra("kintent_hint", getString(2131303155));
      this.yhZ.startActivity(localIntent);
      AppMethodBeat.o(29330);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.h
 * JD-Core Version:    0.6.2
 */