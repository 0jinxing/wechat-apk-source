package com.tencent.mm.boot.svg.a.a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.mm.svg.WeChatSVGRenderC2Java;
import com.tencent.mm.svg.c;

public final class ayv extends c
{
  private final int height = 300;
  private final int width = 300;

  public final int a(int paramInt, Object[] paramArrayOfObject)
  {
    switch (paramInt)
    {
    default:
    case 0:
    case 1:
    case 2:
    }
    while (true)
    {
      paramInt = 0;
      while (true)
      {
        return paramInt;
        paramInt = 300;
        continue;
        paramInt = 300;
      }
      Canvas localCanvas = (Canvas)paramArrayOfObject[0];
      paramArrayOfObject = (Looper)paramArrayOfObject[1];
      Object localObject1 = c.h(paramArrayOfObject);
      float[] arrayOfFloat = c.g(paramArrayOfObject);
      Object localObject2 = c.k(paramArrayOfObject);
      ((Paint)localObject2).setFlags(385);
      ((Paint)localObject2).setStyle(Paint.Style.FILL);
      Object localObject3 = c.k(paramArrayOfObject);
      ((Paint)localObject3).setFlags(385);
      ((Paint)localObject3).setStyle(Paint.Style.STROKE);
      ((Paint)localObject2).setColor(-16777216);
      ((Paint)localObject3).setStrokeWidth(1.0F);
      ((Paint)localObject3).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject3).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject3).setStrokeMiter(4.0F);
      ((Paint)localObject3).setPathEffect(null);
      localObject3 = c.a((Paint)localObject3, paramArrayOfObject);
      ((Paint)localObject3).setStrokeWidth(1.0F);
      localCanvas.save();
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 4.5F, 0.0F, 1.0F, 6.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      Object localObject4 = c.a((Paint)localObject3, paramArrayOfObject);
      ((Paint)localObject4).setColor(-16139513);
      ((Paint)localObject4).setStrokeWidth(4.5F);
      Object localObject5 = c.l(paramArrayOfObject);
      ((Path)localObject5).moveTo(225.31592F, 264.80075F);
      ((Path)localObject5).cubicTo(202.24803F, 280.39413F, 174.43497F, 289.5F, 144.49512F, 289.5F);
      ((Path)localObject5).cubicTo(64.692665F, 289.5F, 0.0F, 224.80733F, 0.0F, 145.00488F);
      ((Path)localObject5).cubicTo(0.0F, 65.202431F, 64.692665F, 0.5097656F, 144.49512F, 0.5097656F);
      ((Path)localObject5).cubicTo(224.29756F, 0.5097656F, 288.99023F, 65.202431F, 288.99023F, 145.00488F);
      ((Path)localObject5).cubicTo(288.99023F, 172.66171F, 281.22012F, 198.50374F, 267.7438F, 220.46706F);
      ((Path)localObject5).cubicTo(264.53351F, 219.51198F, 261.12067F, 219.0F, 257.57407F, 219.0F);
      ((Path)localObject5).cubicTo(238.94579F, 219.0F, 223.5F, 234.44579F, 223.5F, 253.92592F);
      ((Path)localObject5).cubicTo(223.5F, 257.71713F, 224.13977F, 261.37653F, 225.31592F, 264.80075F);
      ((Path)localObject5).close();
      localCanvas.drawPath((Path)localObject5, (Paint)localObject4);
      localCanvas.restore();
      localCanvas.save();
      localObject5 = c.a((Paint)localObject3, paramArrayOfObject);
      ((Paint)localObject5).setColor(-16139513);
      ((Paint)localObject5).setStrokeWidth(4.5F);
      localObject4 = c.l(paramArrayOfObject);
      ((Path)localObject4).moveTo(225.42502F, 265.11334F);
      ((Path)localObject4).cubicTo(202.44864F, 280.51575F, 174.8078F, 289.5F, 145.06857F, 289.5F);
      ((Path)localObject4).cubicTo(103.4674F, 289.5F, 65.972382F, 271.9194F, 39.6078F, 243.78242F);
      ((Path)localObject4).cubicTo(51.589958F, 235.5282F, 64.354462F, 233.1301F, 69.737648F, 231.88483F);
      ((Path)localObject4).cubicTo(81.026443F, 229.27345F, 111.87362F, 216.9068F, 118.01103F, 212.69315F);
      ((Path)localObject4).cubicTo(124.14844F, 208.47949F, 119.95141F, 198.55792F, 118.01103F, 188.25146F);
      ((Path)localObject4).cubicTo(110.53122F, 185.50029F, 104.98407F, 159.45934F, 104.98407F, 159.45934F);
      ((Path)localObject4).cubicTo(104.98407F, 159.45934F, 97.52433F, 159.45934F, 96.307922F, 144.55188F);
      ((Path)localObject4).cubicTo(95.091515F, 129.64441F, 95.465698F, 127.58012F, 101.04079F, 126.78066F);
      ((Path)localObject4).cubicTo(87.780571F, 67.689255F, 136.47884F, 61.383831F, 144.85443F, 62.1828F);
      ((Path)localObject4).cubicTo(150.505F, 60.587788F, 202.99605F, 66.095337F, 189.37816F, 126.78066F);
      ((Path)localObject4).cubicTo(194.95325F, 127.58012F, 195.32744F, 129.64441F, 194.11102F, 144.55188F);
      ((Path)localObject4).cubicTo(192.89462F, 159.45934F, 185.43488F, 159.45934F, 185.43488F, 159.45934F);
      ((Path)localObject4).cubicTo(185.43488F, 159.45934F, 179.88773F, 185.50029F, 172.40791F, 188.25146F);
      ((Path)localObject4).cubicTo(170.46753F, 198.55792F, 171.06592F, 203.13501F, 172.33521F, 207.7002F);
      ((Path)localObject4).cubicTo(173.60449F, 212.26538F, 209.3925F, 229.27345F, 220.6813F, 231.88483F);
      ((Path)localObject4).cubicTo(222.72247F, 232.35701F, 225.82489F, 232.99493F, 229.54349F, 234.05499F);
      ((Path)localObject4).cubicTo(225.7403F, 239.67325F, 223.5F, 246.507F, 223.5F, 253.92592F);
      ((Path)localObject4).cubicTo(223.5F, 257.83276F, 224.17938F, 261.59961F, 225.42502F, 265.11334F);
      ((Path)localObject4).cubicTo(230.11873F, 278.35358F, 242.8526F, 288.0F, 257.57407F, 288.0F);
      ((Path)localObject4).cubicTo(277.05423F, 288.0F, 292.5F, 272.55423F, 292.5F, 253.92592F);
      ((Path)localObject4).cubicTo(292.5F, 234.44579F, 277.05423F, 219.0F, 257.57407F, 219.0F);
      ((Path)localObject4).cubicTo(238.94579F, 219.0F, 223.5F, 234.44579F, 223.5F, 253.92592F);
      ((Path)localObject4).cubicTo(223.5F, 257.83276F, 224.17938F, 261.59961F, 225.42502F, 265.11334F);
      ((Path)localObject4).close();
      localCanvas.drawPath((Path)localObject4, (Paint)localObject5);
      localCanvas.restore();
      localCanvas.save();
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 223.5F, 0.0F, 1.0F, 219.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a((Paint)localObject3, paramArrayOfObject);
      ((Paint)localObject1).setColor(-16139513);
      ((Paint)localObject1).setStrokeWidth(4.5F);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(69.0F, 34.925926F);
      ((Path)localObject3).cubicTo(69.0F, 15.445778F, 53.554222F, 0.0F, 34.074074F, 0.0F);
      ((Path)localObject3).cubicTo(15.445778F, 0.0F, 0.0F, 15.445778F, 0.0F, 34.925926F);
      ((Path)localObject3).cubicTo(0.0F, 53.554222F, 15.445778F, 69.0F, 34.074074F, 69.0F);
      ((Path)localObject3).cubicTo(53.554222F, 69.0F, 69.0F, 53.554222F, 69.0F, 34.925926F);
      ((Path)localObject3).close();
      localCanvas.drawPath((Path)localObject3, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject2, paramArrayOfObject);
      ((Paint)localObject1).setColor(-15549168);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(17.539047F, 36.469982F);
      ((Path)localObject2).cubicTo(16.965199F, 35.876076F, 16.894337F, 34.858051F, 17.392899F, 34.179672F);
      ((Path)localObject2).lineTo(17.603064F, 33.893703F);
      ((Path)localObject2).cubicTo(18.096197F, 33.222706F, 19.024466F, 33.083824F, 19.681692F, 33.587547F);
      ((Path)localObject2).lineTo(27.140253F, 39.304108F);
      ((Path)localObject2).cubicTo(27.795115F, 39.806023F, 28.840012F, 39.784676F, 29.48546F, 39.246967F);
      ((Path)localObject2).lineTo(50.228977F, 21.965939F);
      ((Path)localObject2).cubicTo(50.869339F, 21.432465F, 51.87162F, 21.477173F, 52.456554F, 22.054852F);
      ((Path)localObject2).lineTo(52.316319F, 21.916353F);
      ((Path)localObject2).cubicTo(52.906212F, 22.498932F, 52.906204F, 23.441837F, 52.31567F, 24.023008F);
      ((Path)localObject2).lineTo(29.393995F, 46.581364F);
      ((Path)localObject2).cubicTo(28.803743F, 47.162258F, 27.861687F, 47.1534F, 27.286201F, 46.557804F);
      ((Path)localObject2).lineTo(17.539047F, 36.469982F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.ayv
 * JD-Core Version:    0.6.2
 */