package com.tencent.mm.plugin.appbrand.e;

import android.graphics.SurfaceTexture;
import android.view.MotionEvent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import org.json.JSONObject;

public class e
  implements g
{
  protected f hpM;
  protected boolean hpN;
  protected int id;
  protected String type;

  public String a(c paramc, JSONObject paramJSONObject, m paramm, int paramInt)
  {
    return null;
  }

  public final void a(f paramf)
  {
    this.hpM = paramf;
  }

  public boolean a(m paramm)
  {
    return this.hpN;
  }

  public final f aAn()
  {
    return this.hpM;
  }

  public void d(SurfaceTexture paramSurfaceTexture)
  {
    this.hpN = true;
  }

  public final int getId()
  {
    return this.id;
  }

  public final String getType()
  {
    return this.type;
  }

  public void m(MotionEvent paramMotionEvent)
  {
  }

  public final void setId(int paramInt)
  {
    this.id = paramInt;
  }

  public final void setType(String paramString)
  {
    this.type = paramString;
  }

  protected final String wP()
  {
    AppMethodBeat.i(117343);
    String str = d.bc(this.type, this.id);
    AppMethodBeat.o(117343);
    return str;
  }

  public void yr()
  {
    this.hpN = false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.e.e
 * JD-Core Version:    0.6.2
 */