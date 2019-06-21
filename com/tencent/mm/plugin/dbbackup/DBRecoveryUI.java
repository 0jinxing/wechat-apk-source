package com.tencent.mm.plugin.dbbackup;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.plugin.dbbackup.a.a.a;
import com.tencent.mm.plugin.dbbackup.a.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;

public class DBRecoveryUI extends MMActivity
  implements a.b
{
  private static final int[] kIi = { 0, 5, 70, 80, 90, 100, 100 };
  private ProgressBar gHA;
  private int gOW;
  private com.tencent.mm.plugin.dbbackup.a.a kIa;
  private View kIb;
  private View kIc;
  private TextView kId;
  private View kIe;
  private int kIf;
  private boolean kIg;
  private DialogInterface.OnClickListener kIh;

  public DBRecoveryUI()
  {
    AppMethodBeat.i(18954);
    this.kIh = new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        AppMethodBeat.i(18943);
        if (DBRecoveryUI.a(DBRecoveryUI.this) != 0)
        {
          DBRecoveryUI.b(DBRecoveryUI.this).setVisibility(0);
          DBRecoveryUI.c(DBRecoveryUI.this).setVisibility(8);
          AppMethodBeat.o(18943);
        }
        while (true)
        {
          return;
          d.bhS();
          AppMethodBeat.o(18943);
        }
      }
    };
    AppMethodBeat.o(18954);
  }

  private void bhJ()
  {
    AppMethodBeat.i(18957);
    if (this.kIa != null)
    {
      ab.e("MicroMsg.DBRecoveryUI", "Recovery task has already started.");
      AppMethodBeat.o(18957);
      return;
    }
    this.kIb.setVisibility(8);
    this.kIc.setVisibility(0);
    this.kIe.setEnabled(true);
    Object localObject = new StringBuilder().append(q.LK());
    com.tencent.mm.kernel.g.RN();
    byte[] arrayOfByte = com.tencent.mm.a.g.x(com.tencent.mm.kernel.a.QF().getBytes()).substring(0, 7).getBytes();
    String str1 = com.tencent.mm.kernel.g.RP().Rs();
    localObject = com.tencent.mm.kernel.g.RP().eJN.getPath();
    String str2 = (String)localObject + "-recovery";
    this.kIf = 0;
    String str3 = com.tencent.mm.kernel.g.RP().eJM + "dbback/";
    a.a locala = new a.a();
    locala.kJp = this;
    locala = locala.aC(arrayOfByte).aD(arrayOfByte);
    locala.kJn = new DBRecoveryUI.5(this);
    locala.kJf = str1;
    locala.kJe = ((String)localObject);
    locala.kJd = str2;
    locala.kJg = (com.tencent.mm.kernel.g.RP().cachePath + "heavyDetailInfo");
    if (this.gOW == 0);
    for (boolean bool = true; ; bool = false)
    {
      locala.kJo = bool;
      this.kIa = locala.Ig(str1 + ".sm").Ih(str1 + ".bak").Ig(str3 + "corrupted/EnMicroMsg.db.sm").Ih(str3 + "corrupted/EnMicroMsg.db.bak").Ig(str3 + "EnMicroMsg.db.sm").Ih(str3 + "EnMicroMsg.db.bak").bia();
      this.kIa.execute(new Void[0]);
      this.kIg = true;
      AppMethodBeat.o(18957);
      break;
    }
  }

  private void bhK()
  {
    AppMethodBeat.i(18958);
    this.kIe.setEnabled(false);
    if (this.kIa != null)
    {
      this.kIa.cancel();
      this.kIa = null;
      AppMethodBeat.o(18958);
    }
    while (true)
    {
      return;
      ab.e("MicroMsg.DBRecoveryUI", "Recovery task is not running.");
      AppMethodBeat.o(18958);
    }
  }

  private static void bhL()
  {
    AppMethodBeat.i(18964);
    z localz = com.tencent.mm.kernel.g.RP().Ry();
    localz.set(89, Integer.valueOf(2));
    localz.dsb();
    AppMethodBeat.o(18964);
  }

  public final void F(long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(18960);
    this.kIg = false;
    this.kIa = null;
    bhL();
    com.tencent.mm.ui.base.h.a(this, getString(2131298835, new Object[] { Long.valueOf(paramLong2 / 1024L / 1024L), Long.valueOf(paramLong1 / 1024L / 1024L) }), null, false, this.kIh);
    AppMethodBeat.o(18960);
  }

  public final void R(int paramInt1, int paramInt2, int paramInt3)
  {
    float f1 = 1.0F;
    AppMethodBeat.i(18959);
    if ((paramInt1 <= 0) || (paramInt1 > 6))
    {
      AppMethodBeat.o(18959);
      return;
    }
    int i;
    int j;
    float f2;
    if (paramInt3 > 0)
    {
      i = kIi[(paramInt1 - 1)];
      j = kIi[paramInt1];
      f2 = paramInt2 / paramInt3;
      if (f2 <= 1.0F)
        break label165;
    }
    while (true)
    {
      f2 = i;
      paramInt3 = (int)(f1 * (j - i) + f2);
      this.gHA.setProgress(paramInt3);
      while (true)
      {
        this.kIf = paramInt1;
        String str = getResources().getStringArray(2131755013)[(paramInt1 - 1)];
        this.kId.setText(String.format(str, new Object[] { Integer.valueOf(paramInt2) }));
        AppMethodBeat.o(18959);
        break;
        if (this.kIf != paramInt1)
          this.gHA.setProgress(kIi[(paramInt1 - 1)]);
      }
      label165: f1 = f2;
    }
  }

  public final int getLayoutId()
  {
    return 2130969263;
  }

  public void onBackPressed()
  {
    AppMethodBeat.i(18956);
    if (this.kIg)
    {
      bhK();
      AppMethodBeat.o(18956);
    }
    while (true)
    {
      return;
      finish();
      AppMethodBeat.o(18956);
    }
  }

  public final void onCanceled()
  {
    AppMethodBeat.i(18962);
    this.kIg = false;
    this.kIa = null;
    ab.i("MicroMsg.DBRecoveryUI", "Recovery cancelled.");
    bhL();
    com.tencent.mm.ui.base.h.a(this, 2131298829, 0, false, this.kIh);
    AppMethodBeat.o(18962);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(18955);
    super.onCreate(paramBundle);
    this.gOW = getIntent().getIntExtra("scene", 2);
    this.kIg = false;
    setMMTitle(2131298826);
    this.kIb = findViewById(2131823198);
    this.kIc = findViewById(2131823200);
    this.gHA = ((ProgressBar)findViewById(2131821099));
    this.kId = ((TextView)findViewById(2131823201));
    findViewById(2131823199).setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        AppMethodBeat.i(18945);
        if (com.tencent.mm.kernel.g.RP().Rs() == null)
        {
          com.tencent.mm.ui.base.h.g(DBRecoveryUI.this, 2131298831, 0);
          AppMethodBeat.o(18945);
        }
        while (true)
        {
          return;
          com.tencent.mm.ui.base.h.a(DBRecoveryUI.this, 2131298824, 0, 2131298838, 2131298827, false, new DBRecoveryUI.2.1(this), null, 2131689744);
          AppMethodBeat.o(18945);
        }
      }
    });
    this.kIe = findViewById(2131822819);
    this.kIe.setOnClickListener(new DBRecoveryUI.3(this));
    setBackBtn(new DBRecoveryUI.4(this));
    if (this.gOW == 0)
      bhJ();
    com.tencent.mm.plugin.report.e.pXa.a(181L, this.gOW + 51, 1L, true);
    com.tencent.mm.plugin.report.e.pXa.a(873L, 14L, 1L, false);
    if (this.gOW == 2)
      com.tencent.mm.plugin.report.e.pXa.a(873L, 15L, 1L, false);
    AppMethodBeat.o(18955);
  }

  public final void onFailure()
  {
    AppMethodBeat.i(18963);
    this.kIg = false;
    this.kIa = null;
    ab.e("MicroMsg.DBRecoveryUI", "Recovery failed.");
    bhL();
    com.tencent.mm.ui.base.h.a(this, 2131298830, 0, false, this.kIh);
    AppMethodBeat.o(18963);
  }

  public final void onSuccess()
  {
    AppMethodBeat.i(18961);
    this.kIg = false;
    this.kIa = null;
    ab.i("MicroMsg.DBRecoveryUI", "Recovery succeeded");
    al.n(new DBRecoveryUI.7(this, com.tencent.mm.ui.base.h.a(this, 2131298837, 0, false, new DBRecoveryUI.6(this))), 5000L);
    AppMethodBeat.o(18961);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.dbbackup.DBRecoveryUI
 * JD-Core Version:    0.6.2
 */