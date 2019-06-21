package com.tencent.mm.plugin.story.ui.view.editor.item;

import a.f.b.j;
import a.k.m;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ab.b;
import com.tencent.mm.media.editor.a.i;
import com.tencent.mm.media.editor.c.c;
import com.tencent.mm.protocal.protobuf.cei;
import com.tencent.mm.sdk.platformtools.ab;

@a.l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/ui/view/editor/item/PositionItemView;", "Lcom/tencent/mm/plugin/story/ui/view/editor/item/BitmapItemView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "DEFAULT_BG_COLOR", "", "DEFAULT_TEXT_COLOR", "TAG", "", "latitude", "", "getLatitude", "()F", "setLatitude", "(F)V", "longitude", "getLongitude", "setLongitude", "reportPositionString", "Ljava/lang/StringBuffer;", "getReportPositionString", "()Ljava/lang/StringBuffer;", "setReportPositionString", "(Ljava/lang/StringBuffer;)V", "createPositionBitmap", "Landroid/graphics/Bitmap;", "cityName", "poiName", "createReportString", "", "city", "reshowPosition", "matrix", "Landroid/graphics/Matrix;", "setLocation", "location", "Lcom/tencent/mm/protocal/protobuf/StoryLocation;", "setValidArea", "validRect", "Landroid/graphics/Rect;", "plugin-story_release"})
public final class e extends a
{
  private final String TAG;
  private float cEB;
  private float cGm;
  private final int jka;
  private final int snk;
  private StringBuffer snl;

  public e(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(110692);
    this.TAG = "MicroMsg.PositionItemView";
    this.snk = -1;
    this.jka = -1;
    this.snl = new StringBuffer();
    AppMethodBeat.o(110692);
  }

  public final void a(String paramString1, String paramString2, Matrix paramMatrix)
  {
    AppMethodBeat.i(110688);
    j.p(paramString1, "cityName");
    j.p(paramString2, "poiName");
    j.p(paramMatrix, "matrix");
    gD(paramString1, paramString2);
    setViewMatrix(paramMatrix);
    setSourceDataType(com.tencent.mm.media.editor.a.e.eUo);
    AppMethodBeat.o(110688);
  }

  public final Bitmap gD(String paramString1, String paramString2)
  {
    AppMethodBeat.i(110689);
    j.p(paramString1, "cityName");
    j.p(paramString2, "poiName");
    Object localObject1 = new LinearLayout(getContext());
    localObject1 = LayoutInflater.from(getContext()).inflate(2130970876, (ViewGroup)localObject1, false);
    TextView localTextView = (TextView)((View)localObject1).findViewById(2131828099);
    Object localObject2 = (TextView)((View)localObject1).findViewById(2131828100);
    j.o(localTextView, "cityText");
    b.f(localTextView);
    j.o(localObject2, "poiText");
    b.f((TextView)localObject2);
    localTextView.setText((CharSequence)paramString1);
    ((TextView)localObject2).setText((CharSequence)paramString2);
    if (TextUtils.isEmpty((CharSequence)m.trim((CharSequence)paramString2).toString()))
    {
      localTextView.setTextSize(0, com.tencent.mm.plugin.appbrand.s.e.c(getContext(), 20.0F));
      ((TextView)localObject2).setVisibility(8);
    }
    if (TextUtils.isEmpty((CharSequence)m.trim((CharSequence)paramString1).toString()))
    {
      ((TextView)localObject2).setTextSize(0, com.tencent.mm.plugin.appbrand.s.e.c(getContext(), 20.0F));
      localTextView.setVisibility(8);
    }
    ((View)localObject1).measure(0, 0);
    j.o(localObject1, "parent");
    ((View)localObject1).layout(0, 0, ((View)localObject1).getMeasuredWidth(), ((View)localObject1).getMeasuredHeight());
    ab.i(this.TAG, "cityName : " + paramString1 + ", poiName : " + paramString2 + " parent.measuredWidth:" + ((View)localObject1).getMeasuredWidth() + " , parent.measuredHeight:" + ((View)localObject1).getMeasuredHeight());
    int i = ((View)localObject1).getMeasuredWidth();
    localObject2 = com.tencent.mm.plugin.story.f.l.sac;
    if (i > com.tencent.mm.plugin.story.f.l.czI().width())
    {
      localObject2 = com.tencent.mm.plugin.story.f.l.sac;
      i = com.tencent.mm.plugin.story.f.l.czI().width();
      j = ((View)localObject1).getMeasuredHeight();
      localObject2 = com.tencent.mm.plugin.story.f.l.sac;
      if (j <= com.tencent.mm.plugin.story.f.l.czI().height())
        break label439;
      localObject2 = com.tencent.mm.plugin.story.f.l.sac;
    }
    label439: for (int j = com.tencent.mm.plugin.story.f.l.czI().height(); ; j = ((View)localObject1).getMeasuredHeight())
    {
      localObject2 = Bitmap.createBitmap(i, j, Bitmap.Config.ARGB_8888);
      ((View)localObject1).draw(new Canvas((Bitmap)localObject2));
      setColor(this.snk);
      setTextBg(this.jka);
      setSourceDataType(com.tencent.mm.media.editor.a.e.eUo);
      setLocation(new i(paramString1, paramString2));
      setBitmap((Bitmap)localObject2);
      j.o(localObject2, "bitmap");
      AppMethodBeat.o(110689);
      return localObject2;
      i = ((View)localObject1).getMeasuredWidth();
      break;
    }
  }

  public final float getLatitude()
  {
    return this.cEB;
  }

  public final float getLongitude()
  {
    return this.cGm;
  }

  public final StringBuffer getReportPositionString()
  {
    return this.snl;
  }

  public final void setLatitude(float paramFloat)
  {
    this.cEB = paramFloat;
  }

  public final void setLocation(cei paramcei)
  {
    AppMethodBeat.i(110690);
    j.p(paramcei, "location");
    String str1 = paramcei.guP;
    j.o(str1, "location.City");
    String str2 = paramcei.eUu;
    j.o(str2, "location.poiName");
    gD(str1, str2);
    str2 = paramcei.guP;
    j.o(str2, "location.City");
    str1 = paramcei.eUu;
    j.o(str1, "location.poiName");
    this.snl.setLength(0);
    if (!TextUtils.isEmpty((CharSequence)str2))
      this.snl.append(m.i(str2, ",", " ", true));
    if (!TextUtils.isEmpty((CharSequence)str1))
      if (((CharSequence)this.snl).length() <= 0)
        break label191;
    label191: for (int i = 1; ; i = 0)
    {
      if (i != 0)
        this.snl.append("|");
      this.snl.append(m.i(str1, ",", " ", true));
      this.cGm = paramcei.vRp;
      this.cEB = paramcei.vRq;
      AppMethodBeat.o(110690);
      return;
    }
  }

  public final void setLongitude(float paramFloat)
  {
    this.cGm = paramFloat;
  }

  public final void setReportPositionString(StringBuffer paramStringBuffer)
  {
    AppMethodBeat.i(110691);
    j.p(paramStringBuffer, "<set-?>");
    this.snl = paramStringBuffer;
    AppMethodBeat.o(110691);
  }

  public final void setValidArea(Rect paramRect)
  {
    AppMethodBeat.i(110687);
    j.p(paramRect, "validRect");
    getTouchTracker().aKk.postTranslate(paramRect.width() / 2.0F, paramRect.height() * 0.7F);
    AppMethodBeat.o(110687);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.editor.item.e
 * JD-Core Version:    0.6.2
 */