package com.tencent.mm.plugin.appbrand.canvas.action.arg;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.canvas.a.a;
import com.tencent.mm.plugin.appbrand.canvas.d;
import com.tencent.mm.plugin.appbrand.canvas.e;
import com.tencent.mm.plugin.appbrand.r.g;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;

public class RealSetFillStyleActionPatternArg extends RealSetFillStyleActionArg
{
  public static final Parcelable.Creator<RealSetFillStyleActionPatternArg> CREATOR;
  public String hdc;
  public String path;

  static
  {
    AppMethodBeat.i(103388);
    CREATOR = new RealSetFillStyleActionPatternArg.1();
    AppMethodBeat.o(103388);
  }

  public RealSetFillStyleActionPatternArg()
  {
  }

  public RealSetFillStyleActionPatternArg(Parcel paramParcel)
  {
    super(paramParcel);
  }

  public final boolean a(d paramd, Canvas paramCanvas)
  {
    AppMethodBeat.i(103381);
    boolean bool;
    if (bo.isNullOrNil(this.path))
    {
      bool = false;
      AppMethodBeat.o(103381);
      return bool;
    }
    paramCanvas = paramd.hcF;
    paramd = paramd.hcK.a(paramd, this.path);
    Object localObject;
    int i;
    int j;
    int k;
    if ((paramd != null) && (!paramd.isRecycled()))
    {
      localObject = this.hdc;
      i = g.qb(paramd.getWidth());
      j = g.qb(paramd.getHeight());
      k = -1;
      switch (((String)localObject).hashCode())
      {
      default:
        switch (k)
        {
        default:
          label128: paramd = null;
        case 0:
        case 1:
        case 2:
        case 3:
        }
        break;
      case -934531685:
      case -436782906:
      case -436782905:
      case -724648153:
      }
    }
    while (true)
    {
      paramCanvas.setShader(paramd);
      bool = true;
      AppMethodBeat.o(103381);
      break;
      if (!((String)localObject).equals("repeat"))
        break label128;
      k = 0;
      break label128;
      if (!((String)localObject).equals("repeat-x"))
        break label128;
      k = 1;
      break label128;
      if (!((String)localObject).equals("repeat-y"))
        break label128;
      k = 2;
      break label128;
      if (!((String)localObject).equals("no-repeat"))
        break label128;
      k = 3;
      break label128;
      localObject = Bitmap.createScaledBitmap(paramd, i, j, false);
      paramd = Shader.TileMode.REPEAT;
      paramd = new BitmapShader((Bitmap)localObject, paramd, paramd);
      continue;
      localObject = Bitmap.createBitmap(i, j + 1, Bitmap.Config.ARGB_8888);
      new Canvas((Bitmap)localObject).drawBitmap(paramd, new Rect(0, 0, paramd.getWidth(), paramd.getHeight()), new RectF(0.0F, 0.0F, i, j), null);
      paramd = new BitmapShader((Bitmap)localObject, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP);
      continue;
      localObject = Bitmap.createBitmap(i + 1, j, Bitmap.Config.ARGB_8888);
      new Canvas((Bitmap)localObject).drawBitmap(paramd, new Rect(0, 0, paramd.getWidth(), paramd.getHeight()), new RectF(0.0F, 0.0F, i, j), null);
      paramd = new BitmapShader((Bitmap)localObject, Shader.TileMode.CLAMP, Shader.TileMode.REPEAT);
      continue;
      localObject = Bitmap.createBitmap(i + 1, j + 1, Bitmap.Config.ARGB_8888);
      new Canvas((Bitmap)localObject).drawBitmap(paramd, new Rect(0, 0, paramd.getWidth(), paramd.getHeight()), new RectF(0.0F, 0.0F, i, j), null);
      paramd = Shader.TileMode.CLAMP;
      paramd = new BitmapShader((Bitmap)localObject, paramd, paramd);
    }
  }

  public int describeContents()
  {
    return 0;
  }

  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    AppMethodBeat.i(103382);
    if (this == paramObject)
      AppMethodBeat.o(103382);
    while (true)
    {
      return bool;
      if (!(paramObject instanceof RealSetFillStyleActionPatternArg))
      {
        AppMethodBeat.o(103382);
        bool = false;
      }
      else if (!super.equals(paramObject))
      {
        AppMethodBeat.o(103382);
        bool = false;
      }
      else
      {
        paramObject = (RealSetFillStyleActionPatternArg)paramObject;
        if ((Objects.equals(this.path, paramObject.path)) && (Objects.equals(this.hdc, paramObject.hdc)))
        {
          AppMethodBeat.o(103382);
        }
        else
        {
          AppMethodBeat.o(103382);
          bool = false;
        }
      }
    }
  }

  public final void f(JSONArray paramJSONArray)
  {
    AppMethodBeat.i(103386);
    super.f(paramJSONArray);
    this.path = paramJSONArray.optString(1);
    this.hdc = paramJSONArray.optString(2);
    AppMethodBeat.o(103386);
  }

  public int hashCode()
  {
    AppMethodBeat.i(103383);
    int i = Objects.hash(new Object[] { Integer.valueOf(super.hashCode()), this.path, this.hdc });
    AppMethodBeat.o(103383);
    return i;
  }

  public final void i(Parcel paramParcel)
  {
    AppMethodBeat.i(103384);
    super.i(paramParcel);
    this.path = paramParcel.readString();
    this.hdc = paramParcel.readString();
    AppMethodBeat.o(103384);
  }

  public final void j(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(103387);
    super.j(paramJSONObject);
    AppMethodBeat.o(103387);
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(103385);
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeString(this.path);
    paramParcel.writeString(this.hdc);
    AppMethodBeat.o(103385);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.canvas.action.arg.RealSetFillStyleActionPatternArg
 * JD-Core Version:    0.6.2
 */