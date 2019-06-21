package com.tencent.mm.plugin.game.luggage;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;

public class GameLuggageEntrance extends MMActivity
{
  public final int getLayoutId()
  {
    return 2130970012;
  }

  public void onCreate(final Bundle paramBundle)
  {
    AppMethodBeat.i(135801);
    super.onCreate(paramBundle);
    paramBundle = (EditText)findViewById(2131825692);
    ((Button)findViewById(2131825693)).setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        AppMethodBeat.i(135798);
        String str = paramBundle.getText().toString();
        if (!bo.isNullOrNil(str))
        {
          new Bundle().putString("rawUrl", str);
          paramAnonymousView = new Intent(GameLuggageEntrance.this, LuggageGameWebViewUI.class);
          paramAnonymousView.putExtra("rawUrl", str);
          GameLuggageEntrance.this.startActivity(paramAnonymousView);
        }
        AppMethodBeat.o(135798);
      }
    });
    ((Button)findViewById(2131825694)).setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        AppMethodBeat.i(135799);
        new Bundle().putString("rawUrl", "https://game.weixin.qq.com/cgi-bin/h5/static/centerbox/index_v6.html?wechat_pkgid=index_v6&abt=21");
        paramAnonymousView = new Intent(GameLuggageEntrance.this, LuggageGameWebViewUI.class);
        paramAnonymousView.putExtra("rawUrl", "https://game.weixin.qq.com/cgi-bin/h5/static/centerbox/index_v6.html?wechat_pkgid=index_v6&abt=21");
        GameLuggageEntrance.this.startActivity(paramAnonymousView);
        AppMethodBeat.o(135799);
      }
    });
    setBackBtn(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        AppMethodBeat.i(135800);
        GameLuggageEntrance.this.finish();
        AppMethodBeat.o(135800);
        return false;
      }
    });
    AppMethodBeat.o(135801);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.luggage.GameLuggageEntrance
 * JD-Core Version:    0.6.2
 */