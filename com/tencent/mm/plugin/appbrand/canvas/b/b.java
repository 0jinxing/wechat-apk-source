package com.tencent.mm.plugin.appbrand.canvas.b;

import android.graphics.Path;
import android.graphics.RectF;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.canvas.action.arg.path.BasePathActionArg;
import com.tencent.mm.plugin.appbrand.canvas.action.arg.path.PathArcActionArg;
import com.tencent.mm.plugin.appbrand.r.g;
import org.json.JSONArray;

public final class b
  implements a
{
  private static boolean a(Path paramPath, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, boolean paramBoolean)
  {
    AppMethodBeat.i(103667);
    float f1 = paramFloat1 - paramFloat3;
    float f2 = paramFloat2 - paramFloat3;
    float f3 = paramFloat1 + paramFloat3;
    float f4 = paramFloat2 + paramFloat3;
    paramFloat4 = (float)Math.toDegrees(paramFloat4);
    paramFloat1 = (float)Math.toDegrees(paramFloat5);
    paramFloat5 = (float)(360.0D / (6.283185307179586D * paramFloat3));
    if (paramBoolean)
      if (paramFloat4 - paramFloat1 >= 360.0F)
      {
        paramFloat1 = -360.0F;
        paramFloat2 = paramFloat1 % 360.0F;
        if ((paramFloat2 > paramFloat5) || (paramFloat2 < -paramFloat5))
          break label281;
        paramPath.arcTo(new RectF(f1, f2, f3, f4), paramFloat4, paramFloat1, false);
        paramPath.addArc(new RectF(f1, f2, f3, f4), paramFloat4, paramFloat1);
      }
    while (true)
    {
      AppMethodBeat.o(103667);
      return true;
      paramFloat2 = paramFloat4 % 360.0F;
      paramFloat3 = paramFloat1 % 360.0F;
      paramFloat1 = paramFloat2;
      if (paramFloat2 < 0.0F)
        paramFloat1 = paramFloat2 + 360.0F;
      paramFloat2 = paramFloat3;
      if (paramFloat3 < 0.0F)
        paramFloat2 = paramFloat3 + 360.0F;
      if (paramFloat2 >= paramFloat1)
      {
        paramFloat1 = paramFloat2 - paramFloat1 - 360.0F;
        break;
      }
      paramFloat1 = paramFloat2 - paramFloat1;
      break;
      if (paramFloat1 - paramFloat4 >= 360.0F)
      {
        paramFloat1 = 360.0F;
        break;
      }
      paramFloat2 = paramFloat4 % 360.0F;
      paramFloat3 = paramFloat1 % 360.0F;
      paramFloat1 = paramFloat2;
      if (paramFloat2 < 0.0F)
        paramFloat1 = paramFloat2 + 360.0F;
      paramFloat2 = paramFloat3;
      if (paramFloat3 < 0.0F)
        paramFloat2 = paramFloat3 + 360.0F;
      if (paramFloat2 >= paramFloat1)
      {
        paramFloat1 = paramFloat2 - paramFloat1;
        break;
      }
      paramFloat1 = paramFloat2 + 360.0F - paramFloat1;
      break;
      label281: paramPath.arcTo(new RectF(f1, f2, f3, f4), paramFloat4, paramFloat1, false);
    }
  }

  public final boolean a(Path paramPath, BasePathActionArg paramBasePathActionArg)
  {
    AppMethodBeat.i(103665);
    boolean bool;
    if ((paramBasePathActionArg == null) || (!(paramBasePathActionArg instanceof PathArcActionArg)))
    {
      bool = false;
      AppMethodBeat.o(103665);
    }
    while (true)
    {
      return bool;
      paramBasePathActionArg = (PathArcActionArg)paramBasePathActionArg;
      bool = a(paramPath, paramBasePathActionArg.x, paramBasePathActionArg.y, paramBasePathActionArg.radius, paramBasePathActionArg.hcR, paramBasePathActionArg.hdt, paramBasePathActionArg.hdu);
      AppMethodBeat.o(103665);
    }
  }

  public final boolean a(Path paramPath, JSONArray paramJSONArray)
  {
    boolean bool = false;
    AppMethodBeat.i(103664);
    if (paramJSONArray.length() < 5)
      AppMethodBeat.o(103664);
    while (true)
    {
      return bool;
      bool = a(paramPath, g.d(paramJSONArray, 0), g.d(paramJSONArray, 1), g.d(paramJSONArray, 2), (float)paramJSONArray.optDouble(3), (float)paramJSONArray.optDouble(4), paramJSONArray.optBoolean(5));
      AppMethodBeat.o(103664);
    }
  }

  public final BasePathActionArg ayr()
  {
    AppMethodBeat.i(103666);
    PathArcActionArg localPathArcActionArg = new PathArcActionArg();
    AppMethodBeat.o(103666);
    return localPathArcActionArg;
  }

  public final String getMethod()
  {
    return "arc";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.canvas.b.b
 * JD-Core Version:    0.6.2
 */