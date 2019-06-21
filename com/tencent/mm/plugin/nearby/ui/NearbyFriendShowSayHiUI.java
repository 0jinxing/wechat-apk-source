package com.tencent.mm.plugin.nearby.ui;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.messenger.foundation.a.a.f;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.storage.bf;
import com.tencent.mm.ui.MMActivity;

public class NearbyFriendShowSayHiUI extends MMActivity
{
  ImageView ejo;
  String oPX = "";
  View oPY = null;

  public final int getLayoutId()
  {
    return 2130970290;
  }

  public final void initView()
  {
    AppMethodBeat.i(55432);
    setBackBtn(new NearbyFriendShowSayHiUI.1(this));
    ((Button)findViewById(2131826299)).setOnClickListener(new NearbyFriendShowSayHiUI.2(this));
    this.oPY = findViewById(2131824685);
    this.oPY.setVisibility(0);
    this.oPY.setOnClickListener(new NearbyFriendShowSayHiUI.3(this));
    AppMethodBeat.o(55432);
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(55433);
    if ((paramInt1 == 2009) && (paramInt2 == -1))
      finish();
    AppMethodBeat.o(55433);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(55429);
    super.onCreate(paramBundle);
    setMMTitle(2131301639);
    initView();
    AppMethodBeat.o(55429);
  }

  public void onPause()
  {
    AppMethodBeat.i(55431);
    super.onPause();
    AppMethodBeat.o(55431);
  }

  public void onResume()
  {
    AppMethodBeat.i(55430);
    super.onResume();
    Object localObject = (TextView)findViewById(2131824687);
    g.RN().QU();
    int i = ((j)g.K(j.class)).bOo().baS();
    if (i == 0)
    {
      this.oPY.setVisibility(4);
      AppMethodBeat.o(55430);
    }
    while (true)
    {
      return;
      ((TextView)localObject).setText(getResources().getQuantityString(2131361819, i, new Object[] { Integer.valueOf(i) }));
      this.ejo = ((ImageView)findViewById(2131824686));
      localObject = ((j)g.K(j.class)).bOo().bOx();
      if (localObject != null)
      {
        this.oPX = ((bf)localObject).field_sayhiuser;
        a.b.b(this.ejo, this.oPX);
      }
      AppMethodBeat.o(55430);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.nearby.ui.NearbyFriendShowSayHiUI
 * JD-Core Version:    0.6.2
 */