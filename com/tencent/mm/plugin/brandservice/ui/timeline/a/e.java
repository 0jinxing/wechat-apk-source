package com.tencent.mm.plugin.brandservice.ui.timeline.a;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.protocal.protobuf.eu;
import com.tencent.mm.protocal.protobuf.ev;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.q;
import java.util.Iterator;
import java.util.LinkedList;

public class e
{
  public ImageView ejo;
  public TextView enf;
  public View jOR;
  private View.OnClickListener jPb;
  public com.tencent.mm.plugin.brandservice.ui.timeline.a jPm;
  public View jPn;
  public View jPo;
  public TextView jPp;
  public Context mContext;

  public e()
  {
    AppMethodBeat.i(14250);
    this.jPb = new e.1(this);
    AppMethodBeat.o(14250);
  }

  public static void N(View paramView, int paramInt)
  {
    AppMethodBeat.i(14253);
    ViewGroup.LayoutParams localLayoutParams = paramView.getLayoutParams();
    localLayoutParams.height = paramInt;
    paramView.setLayoutParams(localLayoutParams);
    AppMethodBeat.o(14253);
  }

  public void a(View paramView, com.tencent.mm.plugin.brandservice.ui.timeline.a parama)
  {
    AppMethodBeat.i(14251);
    b(paramView.getContext(), parama);
    AppMethodBeat.o(14251);
  }

  public void a(ImageView paramImageView, q paramq, int paramInt, String paramString)
  {
    AppMethodBeat.i(14256);
    ((com.tencent.mm.plugin.brandservice.a.a)g.K(com.tencent.mm.plugin.brandservice.a.a.class)).a(paramImageView, paramq.field_msgId, paramString, paramq.field_content, paramInt);
    paramImageView.setOnClickListener(this.jPb);
    AppMethodBeat.o(14256);
  }

  public final boolean a(View paramView, TextView paramTextView, q paramq, p paramp)
  {
    AppMethodBeat.i(14255);
    boolean bool;
    if ((paramp == null) || (bo.isNullOrNil(paramp.url)) || (paramq.field_appMsgStatInfoProto == null) || (bo.ek(paramq.field_appMsgStatInfoProto.vGJ)))
    {
      paramView.setVisibility(8);
      AppMethodBeat.o(14255);
      bool = false;
      return bool;
    }
    Iterator localIterator = paramq.field_appMsgStatInfoProto.vGJ.iterator();
    do
    {
      if (!localIterator.hasNext())
        break;
      paramq = (eu)localIterator.next();
    }
    while (!bo.isEqual(paramq.url, paramp.url));
    for (int i = paramq.vGI; ; i = 0)
    {
      if (i > 0)
      {
        paramView.setVisibility(0);
        if (paramp.type == 5)
          paramTextView.setText(this.mContext.getString(2131297661, new Object[] { Integer.valueOf(i) }));
        while (true)
        {
          AppMethodBeat.o(14255);
          bool = true;
          break;
          paramTextView.setText(this.mContext.getString(2131297660, new Object[] { Integer.valueOf(i) }));
        }
      }
      paramView.setVisibility(8);
      AppMethodBeat.o(14255);
      bool = false;
      break;
    }
  }

  public final boolean a(c paramc, q paramq, p paramp)
  {
    AppMethodBeat.i(14254);
    boolean bool = a(paramc.jOZ, paramc.jPa, paramq, paramp);
    AppMethodBeat.o(14254);
    return bool;
  }

  public void aWH()
  {
    AppMethodBeat.i(14252);
    if (this.jOR == null)
      AppMethodBeat.o(14252);
    while (true)
    {
      return;
      this.ejo = ((ImageView)this.jOR.findViewById(2131821183));
      this.jPp = ((TextView)this.jOR.findViewById(2131821809));
      this.enf = ((TextView)this.jOR.findViewById(2131820988));
      this.jPo = this.jOR.findViewById(2131821808);
      AppMethodBeat.o(14252);
    }
  }

  public final void b(Context paramContext, com.tencent.mm.plugin.brandservice.ui.timeline.a parama)
  {
    this.mContext = paramContext;
    this.jPm = parama;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.a.e
 * JD-Core Version:    0.6.2
 */