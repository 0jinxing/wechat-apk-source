package com.tencent.mm.plugin.sns.ui;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.Window;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.model.r;
import com.tencent.mm.n.a;
import com.tencent.mm.plugin.messenger.a.d;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.am.a;
import com.tencent.mm.plugin.sns.model.an;
import com.tencent.mm.plugin.sns.storage.v;
import com.tencent.mm.plugin.webview.ui.tools.widget.o;
import com.tencent.mm.protocal.protobuf.bau;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.az;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.vfs.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@com.tencent.mm.kernel.i
public class SnsGalleryUI extends SnsBaseGalleryUI
  implements s.a
{
  private int rpr = 0;
  private String userName = "";

  public final void dg(String paramString, int paramInt)
  {
    AppMethodBeat.i(38944);
    if (this.rpp != null)
    {
      if ((!bo.isNullOrNil(paramString)) && (paramInt != 3))
      {
        SnsInfoFlip localSnsInfoFlip = this.rpp;
        if (localSnsInfoFlip.items != null)
        {
          paramInt = 0;
          if (paramInt >= 0)
          {
            label42: if (paramInt < localSnsInfoFlip.items.size())
            {
              com.tencent.mm.plugin.sns.h.b localb = (com.tencent.mm.plugin.sns.h.b)localSnsInfoFlip.items.get(paramInt);
              if ((!bo.isNullOrNil(localb.qQd)) && (localb.qQd.equals(paramString)))
                localSnsInfoFlip.items.remove(paramInt);
            }
            while (true)
            {
              break;
              paramInt++;
              break label42;
              paramInt = -1;
            }
          }
          localSnsInfoFlip.rsm.notifyDataSetChanged();
        }
      }
      this.rpp.btt();
    }
    AppMethodBeat.o(38944);
  }

  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(38942);
    boolean bool;
    if ((paramKeyEvent.getKeyCode() == 4) && (paramKeyEvent.getAction() == 0))
    {
      ab.d("MicroMsg.SnsGalleryUI", "dispatchKeyEvent");
      paramKeyEvent = new Intent();
      paramKeyEvent.putExtra("sns_cmd_list", this.rpl.rjk);
      setResult(-1, paramKeyEvent);
      finish();
      bool = true;
      AppMethodBeat.o(38942);
    }
    while (true)
    {
      return bool;
      bool = super.dispatchKeyEvent(paramKeyEvent);
      AppMethodBeat.o(38942);
    }
  }

  public final int getLayoutId()
  {
    return 2130970761;
  }

  public final void initView()
  {
    AppMethodBeat.i(38943);
    this.userName = getIntent().getStringExtra("sns_gallery_userName");
    int i = getIntent().getIntExtra("sns_gallery_localId", 0);
    boolean bool = getIntent().getBooleanExtra("sns_gallery_is_self", false);
    this.rpr = getIntent().getIntExtra("sns_gallery_position", 0);
    Object localObject = v.ap("sns_table_", i);
    ab.i("MicroMsg.SnsGalleryUI", "initView localId:%s, pos:%d", new Object[] { localObject, Integer.valueOf(this.rpr) });
    dh((String)localObject, this.rpr);
    D(bool, 1);
    this.rpp = new SnsInfoFlip(this);
    this.rpp.setNeedScanImage(true);
    ArrayList localArrayList = af.cnv().Yb(this.userName);
    localObject = localArrayList;
    if (localArrayList == null)
      localObject = new ArrayList();
    this.rpp.setDoubleClick(true);
    this.rpp.setShowTitle(true);
    this.rpp.setEnableHorLongBmpMode(false);
    this.rpp.a((List)localObject, this.userName, this.rpr, this.rpk, this);
    this.rpp.setOnDeleteAllAction(new SnsGalleryUI.1(this));
    com.tencent.mm.kernel.g.RQ();
    localObject = ((j)com.tencent.mm.kernel.g.K(j.class)).XM().aoO(this.userName);
    if ((localObject != null) && ((int)((a)localObject).ewQ > 0) && (a.jh(((ap)localObject).field_type)))
      localObject = az.dth();
    while (true)
    {
      this.rpp.setFromScene((az)localObject);
      this.rpp.username = this.userName;
      addView(this.rpp);
      setBackBtn(new SnsGalleryUI.2(this));
      addIconOptionMenu(0, 2130839555, new SnsGalleryUI.3(this, bool));
      AppMethodBeat.o(38943);
      return;
      localObject = r.Yz();
      if (this.userName.equals(localObject))
        localObject = az.dti();
      else
        localObject = az.dtj();
    }
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(38945);
    ab.i("MicroMsg.SnsGalleryUI", "onAcvityResult requestCode:".concat(String.valueOf(paramInt1)));
    if (paramInt2 != -1)
      AppMethodBeat.o(38945);
    String str1;
    String str2;
    while (true)
    {
      return;
      if (2 != paramInt1)
        break label431;
      if (-1 != paramInt2)
        break label519;
      str1 = paramIntent.getStringExtra("Select_Conv_User");
      str2 = paramIntent.getStringExtra("custom_send_text");
      if (this.rpp == null)
        break label531;
      paramIntent = this.rpp.getSelectItem();
      if (paramIntent.cNr.jCt == 6)
        break;
      AppMethodBeat.o(38945);
    }
    label519: label531: for (Object localObject = paramIntent.cNr; ; localObject = null)
    {
      if (localObject == null)
      {
        AppMethodBeat.o(38945);
        break;
      }
      String str3 = an.fZ(af.getAccSnsPath(), ((bau)localObject).Id);
      paramIntent = "";
      String str4 = "";
      String str5 = com.tencent.mm.plugin.sns.data.i.j((bau)localObject);
      if (e.ct(str3 + str5))
      {
        str4 = str3 + str5;
        paramIntent = str3 + com.tencent.mm.plugin.sns.data.i.e((bau)localObject);
      }
      if (e.ct(str3 + com.tencent.mm.plugin.sns.data.i.p((bau)localObject)))
      {
        str4 = str3 + com.tencent.mm.plugin.sns.data.i.p((bau)localObject);
        paramIntent = str3 + com.tencent.mm.plugin.sns.data.i.n((bau)localObject);
      }
      while (true)
      {
        localObject = bo.P(str1.split(","));
        paramInt1 = com.tencent.mm.plugin.sns.data.i.Xr(str4);
        localObject = ((List)localObject).iterator();
        while (((Iterator)localObject).hasNext())
        {
          str1 = (String)((Iterator)localObject).next();
          ab.i("MicroMsg.SnsGalleryUI", "send sight to %s, videopath %s, thumbpath %s duration %d", new Object[] { str1, str4, paramIntent, Integer.valueOf(paramInt1) });
          com.tencent.mm.plugin.messenger.a.g.bOk().a(this, str1, str4, paramIntent, 62, paramInt1, "");
          com.tencent.mm.plugin.messenger.a.g.bOk().eZ(str2, str1);
        }
        com.tencent.mm.ui.widget.snackbar.b.i(this, getString(2131300520));
        AppMethodBeat.o(38945);
        break;
        label431: if (1 == paramInt1)
        {
          paramInt1 = paramIntent.getIntExtra("sns_gallery_op_id", 0);
          str4 = v.ap("sns_table_", paramIntent.getIntExtra("sns_gallery_op_id", 0));
          this.rpl.DN(paramInt1);
          dg(str4, 1);
          if (paramIntent.getBooleanExtra("sns_gallery_force_finish", false))
          {
            paramIntent = new Intent();
            paramIntent.putExtra("sns_cmd_list", this.rpl.rjk);
            setResult(-1, paramIntent);
            finish();
          }
        }
        AppMethodBeat.o(38945);
        break;
      }
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(38938);
    super.onCreate(paramBundle);
    getWindow().addFlags(128);
    xE(this.mController.ylL.getResources().getColor(2131689913));
    Nb(this.mController.ylL.getResources().getColor(2131689913));
    initView();
    AppMethodBeat.o(38938);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(38939);
    if (this.rpp != null)
    {
      this.rpp.ctm();
      this.rpp.onDestroy();
    }
    getWindow().clearFlags(128);
    am.a locala = af.cnv();
    String str = this.userName;
    int i;
    if (locala.qME.containsKey(str))
    {
      i = Math.max(((Integer)locala.qME.get(str)).intValue() - 1, 0);
      locala.qME.put(str, Integer.valueOf(i));
    }
    while (true)
    {
      if (i <= 0)
        locala.qMD.remove(str);
      af.cnC().ab(this);
      super.onDestroy();
      AppMethodBeat.o(38939);
      return;
      i = 0;
    }
  }

  public void onPause()
  {
    AppMethodBeat.i(38940);
    super.onPause();
    o.JV(2);
    AppMethodBeat.o(38940);
  }

  public void onResume()
  {
    AppMethodBeat.i(38941);
    super.onResume();
    if (this.rpp != null)
      this.rpp.btt();
    o.JV(1);
    AppMethodBeat.o(38941);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsGalleryUI
 * JD-Core Version:    0.6.2
 */