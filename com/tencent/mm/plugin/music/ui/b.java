package com.tencent.mm.plugin.music.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.PaintDrawable;
import android.graphics.drawable.ShapeDrawable.ShaderFactory;
import android.graphics.drawable.shapes.RectShape;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.music.model.c;
import com.tencent.mm.plugin.music.model.c.a;
import com.tencent.mm.pluginsdk.ui.applet.CdnImageView;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.ui.base.d;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public final class b extends d
  implements c.a
{
  int count;
  boolean oMH;
  ak oMs;
  final int oOs;
  final int oOt;
  HashMap<Integer, View> oOu;
  c oOv;
  int oOw;
  int scene;

  public b(Context paramContext, int paramInt, boolean paramBoolean)
  {
    super(paramContext);
    AppMethodBeat.i(105083);
    this.oOs = com.tencent.mm.bz.a.fromDPToPix(ah.getContext(), 26);
    this.oOt = com.tencent.mm.bz.a.fromDPToPix(ah.getContext(), 260);
    this.oMs = new ak(Looper.getMainLooper());
    this.oOu = new HashMap();
    this.oOv = new c();
    this.oOv.oMq = this;
    this.scene = paramInt;
    this.oMH = paramBoolean;
    AppMethodBeat.o(105083);
  }

  public final void T(final int paramInt, final long paramLong)
  {
    AppMethodBeat.i(105087);
    al.d(new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(105072);
        View localView = (View)b.this.oOu.get(Integer.valueOf(paramInt));
        if (localView != null)
          ((b.a)localView.getTag()).oOG.setCurrentTime(paramLong);
        AppMethodBeat.o(105072);
      }
    });
    AppMethodBeat.o(105087);
  }

  public final View a(View paramView, ViewGroup paramViewGroup, int paramInt)
  {
    AppMethodBeat.i(105084);
    if (paramView == null)
    {
      paramView = LayoutInflater.from(this.context).inflate(2130970273, paramViewGroup, false);
      paramViewGroup = new b.a(this);
      paramViewGroup.oOz = ((MusicItemLayout)paramView.findViewById(2131826256));
      paramViewGroup.oOE = ((TextView)paramView.findViewById(2131826261));
      paramViewGroup.oOG = ((LyricView)paramView.findViewById(2131826263));
      paramViewGroup.oOA = paramView.findViewById(2131826257);
      paramViewGroup.oOB = paramView.findViewById(2131826259);
      paramViewGroup.oOC = paramView.findViewById(2131826260);
      paramViewGroup.oOD = ((CdnImageView)paramView.findViewById(2131826258));
      paramViewGroup.oOF = ((TextView)paramView.findViewById(2131826262));
      paramView.setTag(paramViewGroup);
    }
    while (true)
    {
      Object localObject = ((com.tencent.mm.plugin.music.e.e)com.tencent.mm.plugin.music.f.c.b.ar(com.tencent.mm.plugin.music.e.e.class)).bTW();
      int i = (paramInt - 100000) % ((List)localObject).size();
      int j = i;
      if (i < 0)
        j = i + ((List)localObject).size();
      ab.d("MicroMsg.Music.MusicMainAdapter", "play music index %d", new Object[] { Integer.valueOf(j) });
      localObject = com.tencent.mm.plugin.music.model.e.bUk().Tp((String)((List)localObject).get(j));
      this.oOu.put(Integer.valueOf(paramInt), paramView);
      paramViewGroup.d((com.tencent.mm.plugin.music.model.e.a)localObject, false);
      AppMethodBeat.o(105084);
      return paramView;
      paramViewGroup = (b.a)paramView.getTag();
    }
  }

  public final void a(com.tencent.mm.plugin.music.model.e.a parama, int[] paramArrayOfInt)
  {
    AppMethodBeat.i(105088);
    Iterator localIterator = this.oOu.entrySet().iterator();
    while (localIterator.hasNext())
    {
      b.a locala = (b.a)((View)((Map.Entry)localIterator.next()).getValue()).getTag();
      if (locala.oMw.field_musicId.equals(parama.field_musicId))
      {
        ab.i("MicroMsg.Music.MusicMainAdapter", "onColorReady: %s", new Object[] { locala.oMw.field_songName });
        int i = paramArrayOfInt[0];
        int j = paramArrayOfInt[1];
        locala.oOz.setBackgroundColor(i);
        locala.oOG.setLyricColor(j);
        locala.oOD.setBackgroundColor(i);
        Object localObject1 = new b.a.1(locala, i);
        Object localObject2 = new PaintDrawable();
        ((PaintDrawable)localObject2).setShape(new RectShape());
        ((PaintDrawable)localObject2).setShaderFactory((ShapeDrawable.ShaderFactory)localObject1);
        locala.oOB.setBackgroundDrawable((Drawable)localObject2);
        localObject2 = new b.a.2(locala, i & 0xFFFFFF | 0x55000000);
        localObject1 = new PaintDrawable();
        ((PaintDrawable)localObject1).setShape(new RectShape());
        ((PaintDrawable)localObject1).setShaderFactory((ShapeDrawable.ShaderFactory)localObject2);
        locala.oOC.setBackgroundDrawable((Drawable)localObject1);
        locala.oOE.setTextColor(j);
        locala.oOF.setTextColor(j);
        ((MusicMainUI)this.context).i(parama);
      }
    }
    AppMethodBeat.o(105088);
  }

  public final int bUL()
  {
    AppMethodBeat.i(105086);
    int i = ((com.tencent.mm.plugin.music.e.e)com.tencent.mm.plugin.music.f.c.b.ar(com.tencent.mm.plugin.music.e.e.class)).bTW().size();
    AppMethodBeat.o(105086);
    return i;
  }

  public final int getCount()
  {
    return this.count;
  }

  public final void zU(int paramInt)
  {
    AppMethodBeat.i(105085);
    this.oOu.remove(Integer.valueOf(paramInt));
    AppMethodBeat.o(105085);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.ui.b
 * JD-Core Version:    0.6.2
 */