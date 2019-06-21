package com.tencent.mm.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class y extends LinearLayout
  implements i.a
{
  private ImageView ejo;
  private TextView jPp;
  private TextView qha;
  private HeaderContainer yoe;
  private ImageView yof;

  public y(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(29684);
    ((LayoutInflater)getContext().getSystemService("layout_inflater")).inflate(2130970246, this, true);
    this.ejo = ((ImageView)findViewById(2131821183));
    this.yof = ((ImageView)findViewById(2131826145));
    this.jPp = ((TextView)findViewById(2131821809));
    this.qha = ((TextView)findViewById(2131826146));
    AppMethodBeat.o(29684);
  }

  public final TextView getNickNameTV()
  {
    return this.jPp;
  }

  public final ImageView getQrCodeIv()
  {
    return this.yof;
  }

  protected final void onDraw(Canvas paramCanvas)
  {
    AppMethodBeat.i(29685);
    super.onDraw(paramCanvas);
    AppMethodBeat.o(29685);
  }

  public final void setAccountName(String paramString)
  {
    AppMethodBeat.i(29686);
    if (this.qha != null)
      this.qha.setText(getResources().getString(2131296520, new Object[] { paramString }));
    AppMethodBeat.o(29686);
  }

  public final void setHeaderContainer(HeaderContainer paramHeaderContainer)
  {
    this.yoe = paramHeaderContainer;
  }

  public final void setNickNameTV(SpannableString paramSpannableString)
  {
    AppMethodBeat.i(29687);
    if (this.jPp != null)
      this.jPp.setText(paramSpannableString);
    AppMethodBeat.o(29687);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.y
 * JD-Core Version:    0.6.2
 */