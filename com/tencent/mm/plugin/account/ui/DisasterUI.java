package com.tencent.mm.plugin.account.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;

public class DisasterUI extends MMActivity
{
  public final int getLayoutId()
  {
    return 2130969294;
  }

  public final boolean needShowIdcError()
  {
    return false;
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(124756);
    super.onCreate(paramBundle);
    paramBundle = getIntent().getStringExtra("key_disaster_content");
    String str = getIntent().getStringExtra("key_disaster_url");
    ab.i("MicroMsg.DisasterUI", "summerdiz onCreate :%d, content[%s], url[%s]", new Object[] { Integer.valueOf(hashCode()), paramBundle, str });
    ((TextView)findViewById(2131823312)).setText(paramBundle);
    findViewById(2131823313).setOnClickListener(new DisasterUI.1(this, str));
    setMMTitle(getString(2131298910));
    setBackBtn(new DisasterUI.2(this));
    AppMethodBeat.o(124756);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.DisasterUI
 * JD-Core Version:    0.6.2
 */