package com.tencent.mm.plugin.appbrand.game.widget.input;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.widget.input.w.a;

public final class a$a extends FrameLayout
  implements w.a
{
  public View huw;

  public a$a(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(130344);
    LayoutInflater.from(paramContext).inflate(2130968682, this, true);
    ((Button)findViewById(2131821188)).setText(2131297109);
    AppMethodBeat.o(130344);
  }

  public final View getConfirmButton()
  {
    AppMethodBeat.i(130343);
    if (this.huw == null)
      this.huw = findViewById(2131821188);
    View localView = this.huw;
    AppMethodBeat.o(130343);
    return localView;
  }

  public final void setIsHide(boolean paramBoolean)
  {
    AppMethodBeat.i(130345);
    if (paramBoolean);
    for (int i = 8; ; i = 0)
    {
      setVisibility(i);
      AppMethodBeat.o(130345);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.game.widget.input.a.a
 * JD-Core Version:    0.6.2
 */