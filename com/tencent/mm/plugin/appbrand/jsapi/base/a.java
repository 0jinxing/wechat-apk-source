package com.tencent.mm.plugin.appbrand.jsapi.base;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.v.b;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.plugin.appbrand.jsapi.f.c;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.plugin.appbrand.page.ac;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class a<CONTEXT extends e> extends d<c>
{
  protected View a(CONTEXT paramCONTEXT, JSONObject paramJSONObject)
  {
    throw new IllegalStateException("inflateView must be inflated");
  }

  protected View a(CONTEXT paramCONTEXT, JSONObject paramJSONObject, int paramInt)
  {
    return a(paramCONTEXT, paramJSONObject);
  }

  public void a(c paramc, final JSONObject paramJSONObject, int paramInt)
  {
    final e locale = ((f)paramc.B(f.class)).c(paramc);
    if (locale == null)
    {
      ab.w("MicroMsg.BaseInsertViewJsApi", "invoke JsApi(%s) failed, component view is null", new Object[] { getName() });
      paramc.M(paramInt, j("fail:ComponentView is null.", null));
    }
    while (true)
    {
      return;
      al.d(new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(91043);
          if (!locale.isRunning())
            AppMethodBeat.o(91043);
          while (true)
          {
            return;
            int i;
            try
            {
              i = a.this.r(paramJSONObject);
              View localView = a.this.a(locale, paramJSONObject, i);
              if (localView != null)
                break label114;
              ab.w("MicroMsg.BaseInsertViewJsApi", "inflate view return null.");
              this.hCL.AR(a.this.j("inflate view failed", null));
              AppMethodBeat.o(91043);
            }
            catch (JSONException localJSONException1)
            {
              this.hCL.AR(a.this.j("fail:invalid view id", null));
              AppMethodBeat.o(91043);
            }
            continue;
            label114: if (locale.aBf().pz(i))
            {
              ab.w("MicroMsg.BaseInsertViewJsApi", "insert view(%d) failed, it has been inserted before.", new Object[] { Integer.valueOf(i) });
              this.hCL.AR(a.this.j("fail:the view has already exist", null));
              AppMethodBeat.o(91043);
              continue;
            }
            int j = paramJSONObject.optInt("parentId", 0);
            try
            {
              Object localObject1 = a.s(paramJSONObject);
              int k = a.t(paramJSONObject);
              Object localObject2 = a.u(paramJSONObject);
              Boolean localBoolean = a.v(paramJSONObject);
              Object localObject3 = locale.aBf();
              if ((localObject2 != null) && (((Boolean)localObject2).booleanValue()))
              {
                bool1 = true;
                label247: if ((localBoolean == null) || (!localBoolean.booleanValue()))
                  break label507;
              }
              label507: for (boolean bool2 = true; ; bool2 = false)
              {
                bool1 = ((ac)localObject3).a(localJSONException1, i, j, (float[])localObject1, k, bool1, bool2);
                bool2 = a.this.aCE();
                if (bool1)
                {
                  a.a(a.this, locale, i, localJSONException1, paramJSONObject);
                  if (!bool2)
                    break label537;
                  a.this.a(locale, i, localJSONException1, paramJSONObject, this.hCL);
                }
                localObject3 = a.this;
                localObject2 = locale;
                localObject1 = ((e)localObject2).aBf().J(i, true);
                if ((f.c)((v.b)localObject1).get("baseViewDestroyListener", null) == null)
                {
                  localObject3 = new a.2((a)localObject3, (e)localObject2, i, (v.b)localObject1);
                  ((v.b)localObject1).j("baseViewDestroyListener", localObject3);
                  ((e)localObject2).a((f.c)localObject3);
                }
                ab.i("MicroMsg.BaseInsertViewJsApi", "insert view(parentId : %s, viewId : %s, view : %s, r : %s)", new Object[] { Integer.valueOf(j), Integer.valueOf(i), Integer.valueOf(localJSONException1.hashCode()), Boolean.valueOf(bool1) });
                if (!bool2)
                {
                  localObject1 = this.hCL;
                  localObject2 = a.this;
                  if (!bool1)
                    break label557;
                  str = "ok";
                  ((g)localObject1).AR(((m)localObject2).j(str, null));
                }
                AppMethodBeat.o(91043);
                break;
                bool1 = false;
                break label247;
              }
            }
            catch (JSONException localJSONException2)
            {
              while (true)
              {
                ab.e("MicroMsg.BaseInsertViewJsApi", "parse position error. Exception :%s", new Object[] { localJSONException2 });
                boolean bool1 = false;
                continue;
                label537: a.this.a(locale, i, str, paramJSONObject);
                continue;
                label557: String str = "fail:insert view fail";
              }
            }
          }
        }
      });
    }
  }

  protected void a(CONTEXT paramCONTEXT, int paramInt, View paramView, JSONObject paramJSONObject)
  {
  }

  protected void a(CONTEXT paramCONTEXT, int paramInt, View paramView, JSONObject paramJSONObject, g paramg)
  {
  }

  protected boolean aCE()
  {
    return false;
  }

  protected boolean aCF()
  {
    return false;
  }

  protected boolean aCG()
  {
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.base.a
 * JD-Core Version:    0.6.2
 */