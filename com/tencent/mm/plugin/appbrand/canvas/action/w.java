package com.tencent.mm.plugin.appbrand.canvas.action;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg;
import com.tencent.mm.plugin.appbrand.canvas.action.arg.DrawActionArg;
import com.tencent.mm.plugin.appbrand.canvas.action.arg.SetGlobalCompositeOperationActionArg;
import org.json.JSONArray;
import org.json.JSONException;

public final class w
  implements d
{
  private static boolean b(com.tencent.mm.plugin.appbrand.canvas.d paramd, String paramString)
  {
    AppMethodBeat.i(103256);
    paramd = paramd.hcF;
    int i = -1;
    switch (paramString.hashCode())
    {
    default:
      switch (i)
      {
      default:
      case 0:
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      case 7:
      case 8:
      case 9:
      case 10:
      case 11:
      case 12:
      case 13:
      case 14:
      }
      break;
    case -130953402:
    case -1698458601:
    case -1112602980:
    case -131372090:
    case 1159099187:
    case 912936772:
    case -1763725041:
    case 1158680499:
    case 170546243:
    case 3059573:
    case 118875:
    case 653829668:
    case -1091287984:
    case -1338968417:
    case 170546239:
    case -120580883:
    case 1242982905:
    case -1427739212:
    case -1247677005:
    case 1728361789:
    case 1686617550:
    case 103672:
    case -230491182:
    case 94842723:
    case -2120744511:
    }
    while (true)
    {
      AppMethodBeat.o(103256);
      return true;
      if (!paramString.equals("source-over"))
        break;
      i = 0;
      break;
      if (!paramString.equals("source-in"))
        break;
      i = 1;
      break;
      if (!paramString.equals("source-out"))
        break;
      i = 2;
      break;
      if (!paramString.equals("source-atop"))
        break;
      i = 3;
      break;
      if (!paramString.equals("destination-over"))
        break;
      i = 4;
      break;
      if (!paramString.equals("destination-in"))
        break;
      i = 5;
      break;
      if (!paramString.equals("destination-out"))
        break;
      i = 6;
      break;
      if (!paramString.equals("destination-atop"))
        break;
      i = 7;
      break;
      if (!paramString.equals("lighter"))
        break;
      i = 8;
      break;
      if (!paramString.equals("copy"))
        break;
      i = 9;
      break;
      if (!paramString.equals("xor"))
        break;
      i = 10;
      break;
      if (!paramString.equals("multiply"))
        break;
      i = 11;
      break;
      if (!paramString.equals("overlay"))
        break;
      i = 12;
      break;
      if (!paramString.equals("darken"))
        break;
      i = 13;
      break;
      if (!paramString.equals("lighten"))
        break;
      i = 14;
      break;
      if (!paramString.equals("color-dodge"))
        break;
      i = 15;
      break;
      if (!paramString.equals("color-burn"))
        break;
      i = 16;
      break;
      if (!paramString.equals("hard-light"))
        break;
      i = 17;
      break;
      if (!paramString.equals("soft-light"))
        break;
      i = 18;
      break;
      if (!paramString.equals("difference"))
        break;
      i = 19;
      break;
      if (!paramString.equals("exclusion"))
        break;
      i = 20;
      break;
      if (!paramString.equals("hue"))
        break;
      i = 21;
      break;
      if (!paramString.equals("saturation"))
        break;
      i = 22;
      break;
      if (!paramString.equals("color"))
        break;
      i = 23;
      break;
      if (!paramString.equals("luminosity"))
        break;
      i = 24;
      break;
      paramd.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
      continue;
      paramd.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
      continue;
      paramd.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OUT));
      continue;
      paramd.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP));
      continue;
      paramd.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
      continue;
      paramd.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
      continue;
      paramd.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
      continue;
      paramd.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_ATOP));
      continue;
      paramd.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.LIGHTEN));
      continue;
      paramd.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.ADD));
      continue;
      paramd.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.XOR));
      continue;
      paramd.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.MULTIPLY));
      continue;
      paramd.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.OVERLAY));
      continue;
      paramd.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DARKEN));
      continue;
      paramd.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.LIGHTEN));
    }
  }

  public final boolean a(com.tencent.mm.plugin.appbrand.canvas.d paramd, Canvas paramCanvas, DrawActionArg paramDrawActionArg)
  {
    AppMethodBeat.i(103257);
    paramCanvas = (SetGlobalCompositeOperationActionArg)paramDrawActionArg;
    boolean bool;
    if (paramCanvas == null)
    {
      bool = false;
      AppMethodBeat.o(103257);
    }
    while (true)
    {
      return bool;
      bool = b(paramd, paramCanvas.type);
      AppMethodBeat.o(103257);
    }
  }

  public final boolean a(com.tencent.mm.plugin.appbrand.canvas.d paramd, Canvas paramCanvas, JSONArray paramJSONArray)
  {
    boolean bool = false;
    AppMethodBeat.i(103255);
    if (paramJSONArray.length() <= 0)
      AppMethodBeat.o(103255);
    while (true)
    {
      return bool;
      try
      {
        paramCanvas = paramJSONArray.getString(0);
        bool = b(paramd, paramCanvas);
        AppMethodBeat.o(103255);
      }
      catch (JSONException paramd)
      {
        AppMethodBeat.o(103255);
      }
    }
  }

  public final BaseDrawActionArg ayf()
  {
    AppMethodBeat.i(103254);
    SetGlobalCompositeOperationActionArg localSetGlobalCompositeOperationActionArg = new SetGlobalCompositeOperationActionArg();
    AppMethodBeat.o(103254);
    return localSetGlobalCompositeOperationActionArg;
  }

  public final String getMethod()
  {
    return "setGlobalCompositeOperation";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.canvas.action.w
 * JD-Core Version:    0.6.2
 */