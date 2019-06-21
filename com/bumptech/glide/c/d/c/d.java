package com.bumptech.glide.c.d.c;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.bumptech.glide.c.b.u;
import com.bumptech.glide.c.k;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;

public final class d
  implements k<Uri, Drawable>
{
  private final Context context;

  public d(Context paramContext)
  {
    AppMethodBeat.i(92290);
    this.context = paramContext.getApplicationContext();
    AppMethodBeat.o(92290);
  }

  private Context a(Uri paramUri, String paramString)
  {
    AppMethodBeat.i(92292);
    try
    {
      paramString = this.context.createPackageContext(paramString, 0);
      AppMethodBeat.o(92292);
      return paramString;
    }
    catch (PackageManager.NameNotFoundException paramString)
    {
      paramUri = new IllegalArgumentException("Failed to obtain context or unrecognized Uri format for: ".concat(String.valueOf(paramUri)), paramString);
      AppMethodBeat.o(92292);
    }
    throw paramUri;
  }

  private int n(Uri paramUri)
  {
    AppMethodBeat.i(92293);
    Object localObject1 = paramUri.getPathSegments();
    String str;
    if (((List)localObject1).size() == 2)
    {
      str = paramUri.getAuthority();
      localObject2 = (String)((List)localObject1).get(0);
      localObject1 = (String)((List)localObject1).get(1);
    }
    Object localObject3;
    for (Object localObject2 = Integer.valueOf(this.context.getResources().getIdentifier((String)localObject1, (String)localObject2, str)); localObject2 == null; localObject3 = null)
      while (true)
      {
        paramUri = new IllegalArgumentException("Unrecognized Uri format: ".concat(String.valueOf(paramUri)));
        AppMethodBeat.o(92293);
        throw paramUri;
        if (((List)localObject1).size() == 1)
          try
          {
            localObject2 = Integer.valueOf((String)((List)localObject1).get(0));
          }
          catch (NumberFormatException localNumberFormatException)
          {
          }
      }
    if (localObject3.intValue() == 0)
    {
      paramUri = new IllegalArgumentException("Failed to obtain resource id for: ".concat(String.valueOf(paramUri)));
      AppMethodBeat.o(92293);
      throw paramUri;
    }
    int i = localObject3.intValue();
    AppMethodBeat.o(92293);
    return i;
  }

  public final u<Drawable> m(Uri paramUri)
  {
    AppMethodBeat.i(92291);
    int i = n(paramUri);
    String str = paramUri.getAuthority();
    if (str.equals(this.context.getPackageName()));
    for (paramUri = this.context; ; paramUri = a(paramUri, str))
    {
      paramUri = c.p(a.b(this.context, paramUri, i));
      AppMethodBeat.o(92291);
      return paramUri;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.d.c.d
 * JD-Core Version:    0.6.2
 */