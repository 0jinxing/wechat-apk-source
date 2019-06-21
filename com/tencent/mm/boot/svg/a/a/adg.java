package com.tencent.mm.boot.svg.a.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.mm.svg.WeChatSVGRenderC2Java;
import com.tencent.mm.svg.c;

public final class adg extends c
{
  private final int height = 96;
  private final int width = 96;

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
        paramInt = 96;
        continue;
        paramInt = 96;
      }
      Canvas localCanvas = (Canvas)paramArrayOfObject[0];
      paramArrayOfObject = (Looper)paramArrayOfObject[1];
      c.h(paramArrayOfObject);
      c.g(paramArrayOfObject);
      Paint localPaint1 = c.k(paramArrayOfObject);
      localPaint1.setFlags(385);
      localPaint1.setStyle(Paint.Style.FILL);
      Paint localPaint2 = c.k(paramArrayOfObject);
      localPaint2.setFlags(385);
      localPaint2.setStyle(Paint.Style.STROKE);
      localPaint1.setColor(-16777216);
      localPaint2.setStrokeWidth(1.0F);
      localPaint2.setStrokeCap(Paint.Cap.BUTT);
      localPaint2.setStrokeJoin(Paint.Join.MITER);
      localPaint2.setStrokeMiter(4.0F);
      localPaint2.setPathEffect(null);
      localPaint2 = c.a(localPaint2, paramArrayOfObject);
      localPaint2.setStrokeWidth(1.0F);
      Paint localPaint3 = c.a(localPaint1, paramArrayOfObject);
      localPaint3.setColor(-8420471);
      Path localPath = c.l(paramArrayOfObject);
      localPath.moveTo(96.0F, 47.448277F);
      localPath.cubicTo(96.0F, 74.509331F, 74.509712F, 96.0F, 48.551723F, 96.0F);
      localPath.cubicTo(21.490286F, 96.0F, 0.0F, 74.509331F, 0.0F, 47.448277F);
      localPath.cubicTo(0.0F, 21.488955F, 21.490286F, 5.94873E-015F, 48.551723F, 5.94873E-015F);
      localPath.cubicTo(74.509712F, 5.94873E-015F, 96.0F, 21.488955F, 96.0F, 47.448277F);
      localPath.close();
      localCanvas.saveLayerAlpha(null, 51, 4);
      localPaint3 = c.a(localPaint3, paramArrayOfObject);
      WeChatSVGRenderC2Java.setFillType(localPath, 2);
      localCanvas.drawPath(localPath, localPaint3);
      localCanvas.restore();
      localCanvas.save();
      localPaint3 = c.a(localPaint1, paramArrayOfObject);
      localPaint3.setColor(-8617594);
      localPath = c.l(paramArrayOfObject);
      localPath.moveTo(96.0F, 48.0F);
      localPath.cubicTo(96.0F, 74.509666F, 74.509666F, 96.0F, 48.0F, 96.0F);
      localPath.cubicTo(21.490332F, 96.0F, 0.0F, 74.509666F, 0.0F, 48.0F);
      localPath.cubicTo(0.0F, 21.490332F, 21.490332F, 0.0F, 48.0F, 0.0F);
      localPath.cubicTo(74.509666F, 0.0F, 96.0F, 21.490332F, 96.0F, 48.0F);
      localPath.close();
      localPath.moveTo(2.232558F, 48.0F);
      localPath.cubicTo(2.232558F, 73.276657F, 22.723339F, 93.767441F, 48.0F, 93.767441F);
      localPath.cubicTo(73.276657F, 93.767441F, 93.767441F, 73.276657F, 93.767441F, 48.0F);
      localPath.cubicTo(93.767441F, 22.723339F, 73.276657F, 2.232558F, 48.0F, 2.232558F);
      localPath.cubicTo(22.723339F, 2.232558F, 2.232558F, 22.723339F, 2.232558F, 48.0F);
      localPath.close();
      WeChatSVGRenderC2Java.setFillType(localPath, 1);
      localCanvas.drawPath(localPath, localPaint3);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localPaint2 = c.a(localPaint2, paramArrayOfObject);
      localPaint1.setColor(-8617594);
      localPaint2.setColor(-8617594);
      localPaint2.setStrokeWidth(2.0F);
      localPath = c.l(paramArrayOfObject);
      localPath.moveTo(60.0F, 50.0F);
      localPath.cubicTo(58.552845F, 50.154545F, 57.837399F, 49.327274F, 59.0F, 48.0F);
      localPath.cubicTo(58.672085F, 47.436363F, 59.506775F, 46.727272F, 61.0F, 47.0F);
      localPath.cubicTo(64.037941F, 45.663635F, 66.542007F, 42.945454F, 67.0F, 40.0F);
      localPath.cubicTo(66.542007F, 35.736362F, 62.845528F, 32.545456F, 59.0F, 32.0F);
      localPath.cubicTo(53.544716F, 32.545456F, 49.84824F, 35.736362F, 50.0F, 40.0F);
      localPath.lineTo(50.0F, 57.0F);
      localPath.cubicTo(49.84824F, 63.272728F, 44.482384F, 68.0F, 38.0F, 68.0F);
      localPath.cubicTo(31.365854F, 68.0F, 26.0F, 63.272728F, 26.0F, 57.0F);
      localPath.cubicTo(26.0F, 52.163635F, 30.173441F, 47.790909F, 36.0F, 47.0F);
      localPath.cubicTo(37.208672F, 46.963638F, 37.804878F, 48.618183F, 37.0F, 49.0F);
      localPath.cubicTo(36.759224F, 49.496105F, 36.373985F, 50.390907F, 35.0F, 50.0F);
      localPath.cubicTo(31.962059F, 51.454544F, 29.457994F, 54.172726F, 29.0F, 57.0F);
      localPath.cubicTo(29.457994F, 61.263638F, 33.154472F, 64.454544F, 37.0F, 65.0F);
      localPath.cubicTo(42.455284F, 64.454544F, 46.15176F, 61.263638F, 46.0F, 57.0F);
      localPath.lineTo(46.0F, 40.0F);
      localPath.cubicTo(46.15176F, 33.727272F, 51.517616F, 29.0F, 58.0F, 29.0F);
      localPath.cubicTo(64.634148F, 29.0F, 70.0F, 33.727272F, 70.0F, 40.0F);
      localPath.cubicTo(70.0F, 44.954544F, 65.826561F, 49.209091F, 60.0F, 50.0F);
      localPath.close();
      WeChatSVGRenderC2Java.setFillType(localPath, 2);
      localCanvas.drawPath(localPath, localPaint1);
      localCanvas.drawPath(localPath, localPaint2);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.adg
 * JD-Core Version:    0.6.2
 */