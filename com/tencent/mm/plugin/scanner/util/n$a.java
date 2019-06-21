package com.tencent.mm.plugin.scanner.util;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.model.k;
import com.tencent.mm.protocal.protobuf.cit;
import com.tencent.mm.sdk.g.a.e;
import com.tencent.mm.sdk.g.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class n$a extends k<Void, Void, Bitmap>
{
  private float angle;
  private Canvas bmG;
  private Bitmap qfT;
  private int qiD;
  private Bitmap qiE;
  private Matrix qiF;
  private Matrix qiG;
  private List<cit> qiH;
  private Set<cit> qiI;
  private Map<Integer, List<cit>> qiJ;

  public n$a(int paramInt, List<cit> paramList, float paramFloat, Bitmap paramBitmap)
  {
    AppMethodBeat.i(81466);
    this.qiD = paramList;
    this.qiH = paramFloat;
    this.angle = paramBitmap;
    Object localObject;
    this.qfT = localObject;
    this.qiI = new HashSet();
    this.qiJ = new HashMap();
    paramInt = this.qiH.iterator();
    label229: 
    while (paramInt.hasNext())
    {
      paramFloat = (cit)paramInt.next();
      if ((paramFloat.Width <= 1) || (paramFloat.Height <= 1) || (paramFloat.Width == 2147483647) || (paramFloat.Height == 2147483647) || (paramFloat.X < 0) || (paramFloat.Y < 0) || (paramFloat.X == 2147483647) || (paramFloat.Y == 2147483647))
        ab.i("MicroMsg.MMAsyncTask", "invalid translation info (%d,%d) %d %d", new Object[] { Integer.valueOf(paramFloat.X), Integer.valueOf(paramFloat.Y), Integer.valueOf(paramFloat.Width), Integer.valueOf(paramFloat.Height) });
      for (paramList = 0; ; paramList = 1)
      {
        if (paramList != 0)
          break label229;
        ab.i("MicroMsg.MMAsyncTask", "remove invalid translation info");
        paramInt.remove();
        break;
      }
    }
    paramInt = this.qiH.iterator();
    while (paramInt.hasNext())
    {
      paramFloat = (cit)paramInt.next();
      if (paramFloat.weB > 0)
      {
        if (!this.qiJ.containsKey(Integer.valueOf(paramFloat.weB)))
          this.qiJ.put(Integer.valueOf(paramFloat.weB), new ArrayList());
        ((List)this.qiJ.get(Integer.valueOf(paramFloat.weB))).add(paramFloat);
      }
      else
      {
        this.qiI.add(paramFloat);
      }
    }
    AppMethodBeat.o(81466);
  }

  private Bitmap ow()
  {
    AppMethodBeat.i(81467);
    Object localObject3;
    Object localObject4;
    Object localObject5;
    long l;
    int i;
    Object localObject2;
    try
    {
      Object localObject1 = this.qfT.copy(Bitmap.Config.ARGB_8888, true);
      localObject3 = new android/graphics/Matrix;
      ((Matrix)localObject3).<init>();
      this.qiF = ((Matrix)localObject3);
      localObject4 = new float[4];
      localObject4[0] = 0.0F;
      localObject4[1] = 0.0F;
      localObject4[2] = this.qfT.getWidth();
      localObject4[3] = this.qfT.getHeight();
      localObject5 = new float[4];
      localObject5[0] = 0.0F;
      localObject5[1] = ((float)(this.qfT.getWidth() * Math.abs(Math.sin(this.angle))));
      localObject5[2] = ((float)(this.qfT.getWidth() * Math.abs(Math.cos(this.angle)) + this.qfT.getHeight() * Math.abs(Math.sin(this.angle))));
      localObject5[3] = ((float)(this.qfT.getHeight() * Math.abs(Math.cos(this.angle))));
      this.qiF.setPolyToPoly((float[])localObject4, 0, (float[])localObject5, 0, 2);
      this.qiF.setRotate(-this.angle);
      localObject3 = new android/graphics/Matrix;
      ((Matrix)localObject3).<init>();
      this.qiG = ((Matrix)localObject3);
      this.qiG.setPolyToPoly((float[])localObject5, 0, (float[])localObject4, 0, 2);
      this.qiG.setRotate(this.angle);
      ab.i("MicroMsg.MMAsyncTask", "angle %s", new Object[] { Float.valueOf(this.angle) });
      l = System.currentTimeMillis();
      this.qiE = Bitmap.createBitmap((Bitmap)localObject1, 0, 0, this.qfT.getWidth(), this.qfT.getHeight(), this.qiF, true);
      ab.i("MicroMsg.MMAsyncTask", "originalBitmap %d, %d  rotatedBitmap %d %d", new Object[] { Integer.valueOf(this.qfT.getWidth()), Integer.valueOf(this.qfT.getHeight()), Integer.valueOf(this.qiE.getWidth()), Integer.valueOf(this.qiE.getHeight()) });
      localObject1 = new android/graphics/Canvas;
      ((Canvas)localObject1).<init>(this.qiE);
      this.bmG = ((Canvas)localObject1);
      ab.i("MicroMsg.MMAsyncTask", "create rotated bitmap cost %d", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
      l = System.currentTimeMillis();
      localObject3 = this.qiH.iterator();
      while (((Iterator)localObject3).hasNext())
      {
        localObject1 = (cit)((Iterator)localObject3).next();
        ab.i("MicroMsg.MMAsyncTask", "x %s, y %s, width %s, height %s, text.length %s", new Object[] { Integer.valueOf(((cit)localObject1).X), Integer.valueOf(((cit)localObject1).Y), Integer.valueOf(((cit)localObject1).Width), Integer.valueOf(((cit)localObject1).Height), Integer.valueOf(((cit)localObject1).wIG.length()) });
        localObject5 = this.qiE;
        if (((cit)localObject1).X + ((cit)localObject1).Width > ((Bitmap)localObject5).getWidth())
          ((cit)localObject1).Width = (((Bitmap)localObject5).getWidth() - ((cit)localObject1).X);
        if (((cit)localObject1).Y + ((cit)localObject1).Height > ((Bitmap)localObject5).getHeight())
          ((cit)localObject1).Height = (((Bitmap)localObject5).getHeight() - ((cit)localObject1).Y);
        localObject5 = Bitmap.createBitmap(this.qiE, ((cit)localObject1).X, ((cit)localObject1).Y, ((cit)localObject1).Width, ((cit)localObject1).Height);
        ab.i("MicroMsg.MMAsyncTask", "area bitmap %d, %d", new Object[] { Integer.valueOf(((Bitmap)localObject5).getWidth()), Integer.valueOf(((Bitmap)localObject5).getHeight()) });
        localObject4 = n.S((Bitmap)localObject5);
        i = localObject4[0];
        localObject5 = this.bmG;
        Paint localPaint = new android/graphics/Paint;
        localPaint.<init>();
        Rect localRect = new android/graphics/Rect;
        localRect.<init>(((cit)localObject1).X, ((cit)localObject1).Y, ((cit)localObject1).Width + ((cit)localObject1).X, ((cit)localObject1).Height + ((cit)localObject1).Y);
        localPaint.setStyle(Paint.Style.FILL_AND_STROKE);
        localPaint.setColor(i);
        localPaint.setAntiAlias(true);
        ((Canvas)localObject5).drawRect(localRect, localPaint);
        if (this.qiI.contains(localObject1))
          n.a(n.a((cit)localObject1), localObject4[1], (cit)localObject1, this.bmG);
      }
    }
    catch (Exception localException)
    {
      ab.printErrStackTrace("MicroMsg.MMAsyncTask", localException, "render translation info error", new Object[0]);
      localObject2 = null;
      AppMethodBeat.o(81467);
    }
    while (true)
    {
      return localObject2;
      ab.i("MicroMsg.MMAsyncTask", "draw all translation bg cost %d", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
      l = System.currentTimeMillis();
      localObject2 = this.qiJ.keySet().iterator();
      while (((Iterator)localObject2).hasNext())
      {
        i = ((Integer)((Iterator)localObject2).next()).intValue();
        localObject3 = new java/util/ArrayList;
        ((ArrayList)localObject3).<init>();
        localObject5 = ((List)this.qiJ.get(Integer.valueOf(i))).iterator();
        while (((Iterator)localObject5).hasNext())
          ((List)localObject3).add(Float.valueOf(n.a((cit)((Iterator)localObject5).next())));
        float f = ((Float)Collections.min((Collection)localObject3)).floatValue();
        localObject4 = (List)this.qiJ.get(Integer.valueOf(i));
        for (i = 0; i < ((List)localObject4).size(); i++)
        {
          localObject5 = (cit)((List)localObject4).get(i);
          ab.i("MicroMsg.MMAsyncTask", "x %s, y %s, width %s, height %s", new Object[] { Integer.valueOf(((cit)localObject5).X), Integer.valueOf(((cit)localObject5).Y), Integer.valueOf(((cit)localObject5).Width), Integer.valueOf(((cit)localObject5).Height) });
          localObject3 = Bitmap.createBitmap(this.qiE, ((cit)localObject5).X, ((cit)localObject5).Y, ((cit)localObject5).Width, ((cit)localObject5).Height);
          ab.i("MicroMsg.MMAsyncTask", "area bitmap %d, %d", new Object[] { Integer.valueOf(((Bitmap)localObject3).getWidth()), Integer.valueOf(((Bitmap)localObject3).getHeight()) });
          n.a(f, n.S(localObject3)[1], (cit)localObject5, this.bmG);
        }
      }
      ab.i("MicroMsg.MMAsyncTask", "draw all translation text cost %d", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
      localObject2 = Bitmap.createBitmap(this.qiE, 0, 0, this.qiE.getWidth(), this.qiE.getHeight(), this.qiG, true);
      ab.i("MicroMsg.MMAsyncTask", "resultBitmap width %d, height %d", new Object[] { Integer.valueOf(((Bitmap)localObject2).getWidth()), Integer.valueOf(((Bitmap)localObject2).getHeight()) });
      localObject3 = new int[this.qfT.getWidth() * this.qfT.getHeight()];
      ((Bitmap)localObject2).getPixels((int[])localObject3, 0, this.qfT.getWidth(), (((Bitmap)localObject2).getWidth() - this.qfT.getWidth()) / 2, (((Bitmap)localObject2).getHeight() - this.qfT.getHeight()) / 2, this.qfT.getWidth(), this.qfT.getHeight());
      localObject2 = com.tencent.mm.sdk.platformtools.d.a((int[])localObject3, this.qfT.getWidth(), this.qfT.getHeight(), Bitmap.Config.ARGB_8888);
      AppMethodBeat.o(81467);
    }
  }

  public final a cin()
  {
    AppMethodBeat.i(81468);
    a locala = com.tencent.mm.sdk.g.d.xDG.cin();
    AppMethodBeat.o(81468);
    return locala;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.util.n.a
 * JD-Core Version:    0.6.2
 */