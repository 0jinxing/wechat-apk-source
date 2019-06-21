package com.tencent.mm.plugin.appbrand.widget.sms;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnKeyListener;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public class EditVerifyCodeView extends RelativeLayout
{
  private ImageView[] joP;
  private TextView[] joQ;
  View.OnKeyListener joR;
  public EditVerifyCodeView.a joS;
  private StringBuilder mBuilder;
  private Context mContext;
  private EditText tc;

  public EditVerifyCodeView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(134404);
    this.mBuilder = new StringBuilder();
    this.joP = new ImageView[6];
    this.joQ = new TextView[6];
    this.joR = new EditVerifyCodeView.3(this);
    dq(paramContext);
    AppMethodBeat.o(134404);
  }

  public EditVerifyCodeView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(134405);
    this.mBuilder = new StringBuilder();
    this.joP = new ImageView[6];
    this.joQ = new TextView[6];
    this.joR = new EditVerifyCodeView.3(this);
    dq(paramContext);
    AppMethodBeat.o(134405);
  }

  @SuppressLint({"InflateParams"})
  private void dq(Context paramContext)
  {
    AppMethodBeat.i(134408);
    this.mContext = paramContext;
    paramContext = LayoutInflater.from(this.mContext).inflate(2130969320, null);
    Object localObject1 = (TextView)paramContext.findViewById(2131823390);
    Object localObject2 = (TextView)paramContext.findViewById(2131823392);
    Object localObject3 = (TextView)paramContext.findViewById(2131823394);
    Object localObject4 = (TextView)paramContext.findViewById(2131823396);
    Object localObject5 = (TextView)paramContext.findViewById(2131823398);
    Object localObject6 = (TextView)paramContext.findViewById(2131823400);
    this.joQ[0] = localObject1;
    this.joQ[1] = localObject2;
    this.joQ[2] = localObject3;
    this.joQ[3] = localObject4;
    this.joQ[4] = localObject5;
    this.joQ[5] = localObject6;
    localObject4 = (ImageView)paramContext.findViewById(2131823391);
    localObject5 = (ImageView)paramContext.findViewById(2131823393);
    localObject6 = (ImageView)paramContext.findViewById(2131823395);
    localObject3 = (ImageView)paramContext.findViewById(2131823397);
    localObject1 = (ImageView)paramContext.findViewById(2131823399);
    localObject2 = (ImageView)paramContext.findViewById(2131823401);
    this.joP[0] = localObject4;
    this.joP[1] = localObject5;
    this.joP[2] = localObject6;
    this.joP[3] = localObject3;
    this.joP[4] = localObject1;
    this.joP[5] = localObject2;
    this.tc = ((EditText)paramContext.findViewById(2131823402));
    this.tc.addTextChangedListener(new EditVerifyCodeView.1(this));
    this.tc.setKeyListener(new EditVerifyCodeView.2(this));
    this.tc.setOnKeyListener(this.joR);
    addView(paramContext, new RelativeLayout.LayoutParams(-1, -1));
    AppMethodBeat.o(134408);
  }

  public String getText()
  {
    AppMethodBeat.i(134406);
    String str = this.mBuilder.toString();
    AppMethodBeat.o(134406);
    return str;
  }

  public void setCodeEditCompleListener(EditVerifyCodeView.a parama)
  {
    this.joS = parama;
  }

  public void setText(String paramString)
  {
    AppMethodBeat.i(134407);
    this.mBuilder.delete(0, this.mBuilder.length());
    this.mBuilder.append(paramString);
    paramString = this.mBuilder.toString();
    int i = paramString.length();
    ab.i("MicroMsg.EditVerifyCodeView", "mBuilder:" + this.mBuilder);
    int j;
    if (i > 0)
    {
      for (j = 0; j < i; j++)
      {
        this.joQ[j].setVisibility(0);
        char c = paramString.charAt(j);
        this.joQ[j].setText(String.valueOf(c));
        this.joP[j].setVisibility(4);
      }
      AppMethodBeat.o(134407);
    }
    while (true)
    {
      return;
      for (j = 0; j < 6; j++)
      {
        this.joQ[j].setVisibility(4);
        this.joQ[j].setText("");
        this.joP[j].setVisibility(0);
      }
      AppMethodBeat.o(134407);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.sms.EditVerifyCodeView
 * JD-Core Version:    0.6.2
 */