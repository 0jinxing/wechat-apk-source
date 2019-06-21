package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.TextView;
import android.widget.TextView.BufferType;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.data.a;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.pluginsdk.ui.e.k;
import com.tencent.mm.pluginsdk.ui.e.o;
import com.tencent.mm.pluginsdk.ui.e.o.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public class AsyncTextView extends TextView
  implements Runnable
{
  private Context context;
  private int klY;
  private String rgY;
  private boolean rgZ;
  private String rha;
  private o.a rhb;
  private boolean rhc;
  private String userName;

  public AsyncTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.context = paramContext;
  }

  public AsyncTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.context = paramContext;
  }

  public final void a(String paramString1, String paramString2, o.a parama, boolean paramBoolean1, String paramString3, int paramInt, boolean paramBoolean2)
  {
    AppMethodBeat.i(38144);
    this.userName = paramString1;
    this.rgY = paramString2;
    this.klY = paramInt;
    this.rgZ = paramBoolean1;
    this.rha = paramString3;
    this.rhb = parama;
    this.rhc = paramBoolean2;
    run();
    AppMethodBeat.o(38144);
  }

  public int getBaseline()
  {
    AppMethodBeat.i(38148);
    try
    {
      i = super.getBaseline();
      AppMethodBeat.o(38148);
      return i;
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        int i = -1;
        AppMethodBeat.o(38148);
      }
    }
  }

  protected void onDraw(Canvas paramCanvas)
  {
    AppMethodBeat.i(38147);
    try
    {
      super.onDraw(paramCanvas);
      AppMethodBeat.o(38147);
      return;
    }
    catch (Throwable paramCanvas)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.AsyncTextView", paramCanvas, "", new Object[0]);
        AppMethodBeat.o(38147);
      }
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(38146);
    try
    {
      super.onMeasure(paramInt1, paramInt2);
      AppMethodBeat.o(38146);
      return;
    }
    catch (Throwable localThrowable)
    {
      while (true)
        AppMethodBeat.o(38146);
    }
  }

  public boolean onPreDraw()
  {
    AppMethodBeat.i(38149);
    try
    {
      bool = super.onPreDraw();
      AppMethodBeat.o(38149);
      return bool;
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        boolean bool = true;
        AppMethodBeat.o(38149);
      }
    }
  }

  public void run()
  {
    AppMethodBeat.i(38145);
    Object localObject1;
    if ((getTag() instanceof String))
    {
      localObject1 = (String)getTag();
      if ((!bo.Q(new String[] { localObject1, this.userName })) && (!this.rgZ) && (((String)localObject1).equals(this.userName)))
      {
        AppMethodBeat.o(38145);
        return;
      }
    }
    if (this.klY == 10);
    for (int i = 3; ; i = 2)
    {
      localObject1 = new o(new a(this.rgZ, this.userName, this.rha, 1), this.rhb, i);
      Context localContext = getContext();
      Object localObject2 = this.rgY;
      getTextSize();
      localObject2 = new k(j.c(localContext, (CharSequence)localObject2, i));
      ((k)localObject2).a(localObject1, this.rgY, 0);
      setText((CharSequence)localObject2, TextView.BufferType.SPANNABLE);
      setTag(this.userName);
      AppMethodBeat.o(38145);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.AsyncTextView
 * JD-Core Version:    0.6.2
 */