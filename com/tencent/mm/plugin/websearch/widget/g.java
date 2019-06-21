package com.tencent.mm.plugin.websearch.widget;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.NumberPicker;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelappbrand.t;
import com.tencent.mm.modelappbrand.y;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.ui.widget.picker.CustomTimePicker;
import com.tencent.mm.ui.widget.picker.a;
import com.tencent.mm.ui.widget.picker.a.a;
import com.tencent.mm.ui.widget.picker.c.a;
import com.tencent.mm.ui.widget.picker.f;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.json.JSONException;
import org.json.JSONObject;

public final class g extends y
{
  Context context;

  public g(Context paramContext)
  {
    this.context = paramContext;
  }

  public final void a(final String paramString1, final String paramString2, final t paramt)
  {
    AppMethodBeat.i(91455);
    al.d(new Runnable()
    {
      public final void run()
      {
        Object localObject1 = null;
        AppMethodBeat.i(91451);
        try
        {
          localObject3 = new org/json/JSONObject;
          ((JSONObject)localObject3).<init>(paramString2);
          localBundle = new android/os/Bundle;
          localBundle.<init>();
          String str = paramString1;
          if (paramString1.equals("date"))
          {
            str = ((JSONObject)localObject3).optString("mode");
            i = -1;
            switch (str.hashCode())
            {
            default:
              switch (i)
              {
              default:
                ab.i("WxaShowPickerListenerImpl", "unknown mode %s", new Object[] { paramString1 });
                AppMethodBeat.o(91451);
              case 0:
              case 1:
              case 2:
              }
              break;
            case 1191572447:
            case 3076014:
            case 3560141:
            }
            while (true)
            {
              return;
              if (!str.equals("selector"))
                break;
              i = 0;
              break;
              if (!str.equals("date"))
                break;
              i = 1;
              break;
              if (!str.equals("time"))
                break;
              i = 2;
              break;
              g.a(g.this, (JSONObject)localObject3, localBundle, paramt);
              AppMethodBeat.o(91451);
            }
          }
        }
        catch (JSONException localJSONException)
        {
          while (true)
          {
            Bundle localBundle;
            int i;
            ab.printErrStackTrace("WxaShowPickerListenerImpl", localJSONException, "", new Object[0]);
            AppMethodBeat.o(91451);
            continue;
            Object localObject7 = g.this;
            Object localObject8 = paramt;
            Object localObject9 = ((JSONObject)localObject3).optString("value");
            Object localObject10 = ((JSONObject)localObject3).optString("start");
            localObject1 = ((JSONObject)localObject3).optString("end");
            Object localObject13 = ((JSONObject)localObject3).optString("fields");
            Object localObject4 = "yyyy-MM-dd";
            if ("month".equals(localObject13))
            {
              localObject4 = "yyyy-MM";
              label301: localObject14 = new java/text/SimpleDateFormat;
              ((SimpleDateFormat)localObject14).<init>((String)localObject4);
            }
            Object localObject2;
            try
            {
              localObject4 = ((SimpleDateFormat)localObject14).parse((String)localObject9);
            }
            catch (ParseException localParseException5)
            {
              try
              {
                localObject10 = ((SimpleDateFormat)localObject14).parse((String)localObject10);
              }
              catch (ParseException localParseException5)
              {
                try
                {
                  while (true)
                  {
                    localObject1 = ((SimpleDateFormat)localObject14).parse((String)localObject1);
                    localObject9 = new com/tencent/mm/ui/widget/picker/a;
                    ((a)localObject9).<init>(((g)localObject7).context);
                    localObject3 = new com/tencent/mm/plugin/websearch/widget/g$3;
                    ((g.3)localObject3).<init>((g)localObject7, (a)localObject9, (SimpleDateFormat)localObject14, localBundle, (t)localObject8);
                    ((a)localObject9).zSj = ((a.a)localObject3);
                    if (localObject4 != null)
                      ((a)localObject9).aB(((Date)localObject4).getYear() + 1900, ((Date)localObject4).getMonth() + 1, ((Date)localObject4).getDate());
                    if (localObject10 != null)
                      ((a)localObject9).aC(((Date)localObject10).getYear() + 1900, ((Date)localObject10).getMonth() + 1, ((Date)localObject10).getDate());
                    if (localObject1 != null)
                      ((a)localObject9).aD(((Date)localObject1).getYear() + 1900, ((Date)localObject1).getMonth() + 1, ((Date)localObject1).getDate());
                    if (!TextUtils.isEmpty((CharSequence)localObject13))
                    {
                      if (!((String)localObject13).equals("year"))
                        break label597;
                      ((a)localObject9).al(false, false);
                      if (((String)localObject13).equals("day"))
                        ((a)localObject9).al(true, true);
                    }
                    ((a)localObject9).show();
                    AppMethodBeat.o(91451);
                    break;
                    if (!"year".equals(localObject13))
                      break label301;
                    localObject4 = "yyyy";
                    break label301;
                    localParseException2 = localParseException2;
                    ab.printErrStackTrace("WxaShowPickerListenerImpl", localParseException2, "", new Object[0]);
                    localObject5 = null;
                    continue;
                    localParseException5 = localParseException5;
                    ab.printErrStackTrace("WxaShowPickerListenerImpl", localParseException5, "", new Object[0]);
                    localObject11 = null;
                  }
                }
                catch (ParseException localParseException1)
                {
                  while (true)
                  {
                    ab.printErrStackTrace("WxaShowPickerListenerImpl", localParseException1, "", new Object[0]);
                    localObject2 = null;
                    continue;
                    label597: if (((String)localObject13).equals("month"))
                      ((a)localObject9).al(true, false);
                  }
                }
              }
            }
            localObject13 = g.this;
            Object localObject14 = paramt;
            localObject7 = new com/tencent/mm/ui/widget/picker/c;
            ((com.tencent.mm.ui.widget.picker.c)localObject7).<init>(((g)localObject13).context);
            Object localObject5 = ((JSONObject)localObject3).optString("value");
            Object localObject11 = ((JSONObject)localObject3).optString("start");
            Object localObject3 = ((JSONObject)localObject3).optString("end");
            localObject8 = new java/text/SimpleDateFormat;
            ((SimpleDateFormat)localObject8).<init>("hh:mm");
            try
            {
              localObject5 = ((SimpleDateFormat)localObject8).parse((String)localObject5);
            }
            catch (ParseException localParseException6)
            {
              try
              {
                localObject11 = ((SimpleDateFormat)localObject8).parse((String)localObject11);
              }
              catch (ParseException localParseException6)
              {
                try
                {
                  while (true)
                  {
                    localObject8 = ((SimpleDateFormat)localObject8).parse((String)localObject3);
                    localObject2 = localObject8;
                    int j;
                    if (localObject5 != null)
                    {
                      i = ((Date)localObject5).getHours();
                      j = ((Date)localObject5).getMinutes();
                      if (((com.tencent.mm.ui.widget.picker.c)localObject7).zSs != null)
                      {
                        localObject5 = ((com.tencent.mm.ui.widget.picker.c)localObject7).zSs;
                        if ((f.qS(i)) && (f.qR(j)))
                        {
                          ((CustomTimePicker)localObject5).setCurrentHour(Integer.valueOf(i));
                          ((CustomTimePicker)localObject5).setCurrentMinute(Integer.valueOf(j));
                        }
                        ((CustomTimePicker)localObject5).aRM();
                      }
                    }
                    if (localObject11 != null)
                    {
                      j = ((Date)localObject11).getHours();
                      i = ((Date)localObject11).getMinutes();
                      if (((com.tencent.mm.ui.widget.picker.c)localObject7).zSs != null)
                      {
                        localObject5 = ((com.tencent.mm.ui.widget.picker.c)localObject7).zSs;
                        ((CustomTimePicker)localObject5).hUy = j;
                        ((CustomTimePicker)localObject5).hUz = i;
                        if ((f.qS(((CustomTimePicker)localObject5).hUy)) && (((CustomTimePicker)localObject5).jkY != null))
                          ((CustomTimePicker)localObject5).jkY.setMinValue(((CustomTimePicker)localObject5).hUy);
                      }
                    }
                    if (localObject2 != null)
                    {
                      j = localObject2.getHours();
                      i = localObject2.getMinutes();
                      if (((com.tencent.mm.ui.widget.picker.c)localObject7).zSs != null)
                      {
                        localObject5 = ((com.tencent.mm.ui.widget.picker.c)localObject7).zSs;
                        ((CustomTimePicker)localObject5).hUA = j;
                        ((CustomTimePicker)localObject5).hUB = i;
                        if ((f.qS(((CustomTimePicker)localObject5).hUA)) && (((CustomTimePicker)localObject5).jkY != null))
                          ((CustomTimePicker)localObject5).jkY.setMaxValue(((CustomTimePicker)localObject5).hUA);
                      }
                    }
                    localObject5 = new com/tencent/mm/plugin/websearch/widget/g$2;
                    ((g.2)localObject5).<init>((g)localObject13, (com.tencent.mm.ui.widget.picker.c)localObject7, localBundle, (t)localObject14);
                    ((com.tencent.mm.ui.widget.picker.c)localObject7).zSt = ((c.a)localObject5);
                    if (((com.tencent.mm.ui.widget.picker.c)localObject7).zaW != null)
                    {
                      if (((com.tencent.mm.ui.widget.picker.c)localObject7).zSs != null)
                        ((com.tencent.mm.ui.widget.picker.c)localObject7).zSs.aRM();
                      ((com.tencent.mm.ui.widget.picker.c)localObject7).zaW.show();
                    }
                    AppMethodBeat.o(91451);
                    break;
                    localParseException3 = localParseException3;
                    ab.printErrStackTrace("WxaShowPickerListenerImpl", localParseException3, "", new Object[0]);
                    Object localObject6 = null;
                    continue;
                    localParseException6 = localParseException6;
                    ab.printErrStackTrace("WxaShowPickerListenerImpl", localParseException6, "", new Object[0]);
                    Object localObject12 = null;
                  }
                }
                catch (ParseException localParseException4)
                {
                  while (true)
                    ab.printErrStackTrace("WxaShowPickerListenerImpl", localParseException4, "", new Object[0]);
                }
              }
            }
          }
        }
      }
    });
    AppMethodBeat.o(91455);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.websearch.widget.g
 * JD-Core Version:    0.6.2
 */