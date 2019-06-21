package com.tencent.mm.plugin.account.bind.ui;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.KeyEvent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.au.b;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.account.friend.ui.i;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMWizardActivity;

public class BindMContactVerifyUI extends MMWizardActivity
{
  private String cFl;
  private SharedPreferences ehZ;
  private int fromScene = 0;
  private boolean gqB = false;
  private EditText grL;
  private TextView grM;
  private Button grN;
  private i grO;
  private int status;

  private void goBack()
  {
    AppMethodBeat.i(13490);
    if (this.grO != null)
      this.grO.recycle();
    Ni(1);
    AppMethodBeat.o(13490);
  }

  public final int getLayoutId()
  {
    return 2130968844;
  }

  public final void initView()
  {
    AppMethodBeat.i(13488);
    this.cFl = ((String)g.RP().Ry().get(4097, null));
    this.grL = ((EditText)findViewById(2131821771));
    this.gqB = getIntent().getBooleanExtra("KEnterFromBanner", false);
    this.fromScene = getIntent().getIntExtra("bind_scene", 0);
    Button localButton = (Button)findViewById(2131821772);
    if ((this.cFl == null) || (this.cFl.equals("")))
      this.cFl = ((String)g.RP().Ry().get(6, null));
    Object localObject = new BindMContactVerifyUI.1(this);
    this.grL.setFilters(new InputFilter[] { localObject });
    this.grN = ((Button)findViewById(2131821735));
    this.grM = ((TextView)findViewById(2131821769));
    this.grM.setText(getString(2131297552, new Object[] { this.cFl }));
    localButton.setOnClickListener(new BindMContactVerifyUI.2(this));
    setBackBtn(new BindMContactVerifyUI.3(this));
    localObject = this.grN;
    if (b.sM(this.cFl));
    for (int i = 0; ; i = 8)
    {
      ((Button)localObject).setVisibility(i);
      this.grN.setOnClickListener(new BindMContactVerifyUI.4(this));
      AppMethodBeat.o(13488);
      return;
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(13486);
    super.onCreate(paramBundle);
    setMMTitle(2131297566);
    this.ehZ = getSharedPreferences(getPackageName() + "_preferences", 0);
    this.status = r.YD();
    initView();
    AppMethodBeat.o(13486);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(13487);
    super.onDestroy();
    AppMethodBeat.o(13487);
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(13489);
    boolean bool;
    if ((paramKeyEvent.getKeyCode() == 4) && (paramKeyEvent.getAction() == 0))
    {
      goBack();
      bool = true;
      AppMethodBeat.o(13489);
    }
    while (true)
    {
      return bool;
      bool = super.onKeyDown(paramInt, paramKeyEvent);
      AppMethodBeat.o(13489);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.bind.ui.BindMContactVerifyUI
 * JD-Core Version:    0.6.2
 */