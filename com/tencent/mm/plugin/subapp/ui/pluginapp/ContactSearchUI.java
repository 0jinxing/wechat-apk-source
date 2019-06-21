package com.tencent.mm.plugin.subapp.ui.pluginapp;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.bp.d;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.aw;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.plugin.subapp.b;
import com.tencent.mm.pluginsdk.j;
import com.tencent.mm.protocal.protobuf.buv;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import java.io.IOException;

public class ContactSearchUI extends MMActivity
  implements com.tencent.mm.ai.f
{
  private ProgressDialog ehJ = null;
  private EditText svm;

  private static int abq(String paramString)
  {
    int i = 3;
    AppMethodBeat.i(25536);
    if (bo.amV(paramString))
    {
      i = 1;
      AppMethodBeat.o(25536);
    }
    while (true)
    {
      return i;
      if (bo.amW(paramString))
      {
        i = 2;
        AppMethodBeat.o(25536);
      }
      else if (bo.amX(paramString))
      {
        AppMethodBeat.o(25536);
      }
      else
      {
        AppMethodBeat.o(25536);
      }
    }
  }

  private void cDP()
  {
    AppMethodBeat.i(25534);
    Object localObject = this.svm.getText().toString().trim();
    if ((localObject == null) || (((String)localObject).length() <= 0))
    {
      com.tencent.mm.ui.base.h.g(this.mController.ylL, 2131304233, 2131297061);
      AppMethodBeat.o(25534);
    }
    while (true)
    {
      return;
      ab.d("MicroMsg.ContactSearchUI", "always search contact from internet!!!");
      com.tencent.mm.plugin.messenger.a.f localf = new com.tencent.mm.plugin.messenger.a.f((String)localObject, 1);
      aw.Rg().a(localf, 0);
      localObject = this.mController.ylL;
      getString(2131297061);
      this.ehJ = com.tencent.mm.ui.base.h.b((Context)localObject, getString(2131296476), true, new ContactSearchUI.5(this, localf));
      AppMethodBeat.o(25534);
    }
  }

  public final int getLayoutId()
  {
    return 2130969237;
  }

  public final void initView()
  {
    AppMethodBeat.i(25533);
    setMMTitle(2131298764);
    this.svm = ((EditText)findViewById(2131823136));
    this.svm.addTextChangedListener(new ContactSearchUI.1(this));
    this.svm.setImeOptions(3);
    this.svm.setOnEditorActionListener(new ContactSearchUI.2(this));
    addTextOptionMenu(0, getString(2131296943), new ContactSearchUI.3(this));
    setBackBtn(new ContactSearchUI.4(this));
    if (getIntent().getBooleanExtra("from_webview", false))
    {
      String str = getIntent().getStringExtra("userName");
      this.svm.setText(str);
      cDP();
    }
    AppMethodBeat.o(25533);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(25530);
    super.onCreate(paramBundle);
    initView();
    AppMethodBeat.o(25530);
  }

  public void onPause()
  {
    AppMethodBeat.i(25532);
    aw.Rg().b(106, this);
    super.onPause();
    AppMethodBeat.o(25532);
  }

  public void onResume()
  {
    AppMethodBeat.i(25531);
    aw.Rg().a(106, this);
    super.onResume();
    AppMethodBeat.o(25531);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(25535);
    ab.i("MicroMsg.ContactSearchUI", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if (this.ehJ != null)
    {
      this.ehJ.dismiss();
      this.ehJ = null;
    }
    if (b.gkF.b(this.mController.ylL, paramInt1, paramInt2, paramString))
      AppMethodBeat.o(25535);
    while (true)
    {
      return;
      if ((paramInt1 == 4) && (paramInt2 == -4))
      {
        com.tencent.mm.ui.base.h.g(this.mController.ylL, 2131296470, 2131297061);
        AppMethodBeat.o(25535);
      }
      else if ((paramInt1 != 0) || (paramInt2 != 0))
      {
        Toast.makeText(this, getString(2131299996), 0).show();
        ab.w("MicroMsg.ContactSearchUI", getString(2131299995, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }));
        AppMethodBeat.o(25535);
      }
      else
      {
        paramString = ((com.tencent.mm.plugin.messenger.a.f)paramm).bOj();
        if (paramString.wod > 0)
        {
          paramm = new Intent();
          paramm.setClass(this, ContactSearchResultUI.class);
          try
          {
            paramm.putExtra("result", paramString.toByteArray());
            startActivity(paramm);
            AppMethodBeat.o(25535);
          }
          catch (IOException paramString)
          {
            ab.printErrStackTrace("MicroMsg.ContactSearchUI", paramString, "", new Object[0]);
            AppMethodBeat.o(25535);
          }
        }
        else
        {
          paramm = aa.a(paramString.wcB);
          Intent localIntent = new Intent();
          ((j)g.K(j.class)).a(localIntent, paramString, abq(this.svm.getText().toString().trim()));
          if (bo.nullAsNil(paramm).length() > 0)
          {
            if ((paramString.wBT & 0x8) > 0)
              com.tencent.mm.plugin.report.service.h.pYm.X(10298, paramm + "," + abq(this.svm.getText().toString().trim()));
            d.b(this, "profile", ".ui.ContactInfoUI", localIntent);
          }
          AppMethodBeat.o(25535);
        }
      }
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.subapp.ui.pluginapp.ContactSearchUI
 * JD-Core Version:    0.6.2
 */