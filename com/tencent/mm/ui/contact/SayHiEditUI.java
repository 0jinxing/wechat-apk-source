package com.tencent.mm.ui.contact;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.aw;
import com.tencent.mm.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.e.b;
import com.tencent.mm.ui.q.b;
import com.tencent.mm.ui.tools.b.c;
import com.tencent.mm.ui.widget.MMEditText;

public class SayHiEditUI extends MMActivity
  implements f
{
  private ProgressDialog ehJ = null;
  private MMEditText zov;

  public final int getLayoutId()
  {
    return 2130970534;
  }

  public final void initView()
  {
    AppMethodBeat.i(33846);
    this.zov = ((MMEditText)findViewById(2131827175));
    this.zov.addTextChangedListener(new SayHiEditUI.a((byte)0));
    c.d(this.zov).PM(100).a(null);
    String str1 = getIntent().getStringExtra("Contact_User");
    int i = getIntent().getIntExtra("Contact_Scene", 18);
    String str2 = getIntent().getStringExtra(e.b.yfT);
    a(0, getString(2131297041), new SayHiEditUI.1(this, str1, i, str2), q.b.ymu);
    setBackBtn(new SayHiEditUI.2(this));
    AppMethodBeat.o(33846);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(33844);
    super.onCreate(paramBundle);
    aw.Rg().a(30, this);
    setMMTitle(2131301632);
    initView();
    AppMethodBeat.o(33844);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(33845);
    aw.Rg().b(30, this);
    super.onDestroy();
    AppMethodBeat.o(33845);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    int i = 1;
    AppMethodBeat.i(33847);
    ab.i("MicroMsg.SayHiEditUI", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    try
    {
      if (this.ehJ != null)
      {
        this.ehJ.dismiss();
        this.ehJ = null;
      }
      switch (paramInt2)
      {
      default:
        i = 0;
      case -22:
        while (i != 0)
        {
          AppMethodBeat.o(33847);
          return;
          Toast.makeText(this, 2131301633, 0).show();
        }
      case -34:
      case -24:
      }
    }
    catch (Exception paramString)
    {
      while (true)
      {
        ab.e("MicroMsg.SayHiEditUI", "exception in onSceneEnd : " + paramString.getMessage());
        AppMethodBeat.o(33847);
        continue;
        Toast.makeText(this, 2131301636, 0).show();
        continue;
        if ((paramInt1 == 0) && (paramInt2 == 0))
        {
          h.bQ(this, getString(2131298422));
          finish();
          AppMethodBeat.o(33847);
        }
        else if ((paramInt1 == 4) && (paramInt2 == -24) && (!ah.isNullOrNil(paramString)))
        {
          Toast.makeText(this, paramString, 1).show();
          AppMethodBeat.o(33847);
        }
        else if ((paramInt2 == -101) && (!ah.isNullOrNil(paramString)))
        {
          h.a(this, paramString, getString(2131297061), getString(2131296994), null);
          AppMethodBeat.o(33847);
        }
        else
        {
          Toast.makeText(this, 2131301634, 0).show();
          AppMethodBeat.o(33847);
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

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.SayHiEditUI
 * JD-Core Version:    0.6.2
 */