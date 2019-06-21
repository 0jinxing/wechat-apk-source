package com.tencent.mm.plugin.messenger;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.a.b;

public class SwitchContactDialogCustomView extends LinearLayout
{
  private TextView TF;
  private TextView opN;
  private ImageView opO;
  private TextView opP;
  private TextView opQ;

  public SwitchContactDialogCustomView(Context paramContext)
  {
    this(paramContext, null);
  }

  public SwitchContactDialogCustomView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(136912);
    LayoutInflater.from(paramContext).inflate(2130968645, this);
    this.TF = ((TextView)findViewById(2131820678));
    this.opN = ((TextView)findViewById(2131821019));
    this.opO = ((ImageView)findViewById(2131821094));
    this.opP = ((TextView)findViewById(2131821095));
    this.opQ = ((TextView)findViewById(2131821096));
    AppMethodBeat.o(136912);
  }

  public void setContent(String paramString)
  {
    AppMethodBeat.i(136914);
    this.opN.setText(paramString);
    AppMethodBeat.o(136914);
  }

  public void setDesc(String paramString)
  {
    AppMethodBeat.i(136915);
    this.opP.setText(paramString);
    AppMethodBeat.o(136915);
  }

  public void setOnPhotoOnClick(View.OnClickListener paramOnClickListener)
  {
    AppMethodBeat.i(136918);
    if (this.opO != null)
      this.opO.setOnClickListener(paramOnClickListener);
    AppMethodBeat.o(136918);
  }

  public void setPhoto(String paramString)
  {
    AppMethodBeat.i(136917);
    a.b.b(this.opO, paramString);
    AppMethodBeat.o(136917);
  }

  public void setSubDesc(String paramString)
  {
    AppMethodBeat.i(136916);
    this.opQ.setText(paramString);
    AppMethodBeat.o(136916);
  }

  public void setTilte(String paramString)
  {
    AppMethodBeat.i(136913);
    this.TF.setText(paramString);
    AppMethodBeat.o(136913);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.messenger.SwitchContactDialogCustomView
 * JD-Core Version:    0.6.2
 */