package com.google.firebase;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Objects.ToStringHelper;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.StringResourceValueReader;
import com.google.android.gms.common.util.Strings;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class b
{
  private final String buI;
  public final String buJ;
  public final String zzs;
  private final String zzt;
  private final String zzu;
  private final String zzw;
  private final String zzx;

  private b(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7)
  {
    AppMethodBeat.i(10596);
    if (!Strings.isEmptyOrWhitespace(paramString1));
    for (boolean bool = true; ; bool = false)
    {
      Preconditions.checkState(bool, "ApplicationId must be set.");
      this.zzs = paramString1;
      this.buI = paramString2;
      this.zzt = paramString3;
      this.zzu = paramString4;
      this.buJ = paramString5;
      this.zzw = paramString6;
      this.zzx = paramString7;
      AppMethodBeat.o(10596);
      return;
    }
  }

  public static b am(Context paramContext)
  {
    AppMethodBeat.i(10597);
    paramContext = new StringResourceValueReader(paramContext);
    String str = paramContext.getString("google_app_id");
    if (TextUtils.isEmpty(str))
    {
      paramContext = null;
      AppMethodBeat.o(10597);
    }
    while (true)
    {
      return paramContext;
      paramContext = new b(str, paramContext.getString("google_api_key"), paramContext.getString("firebase_database_url"), paramContext.getString("ga_trackingId"), paramContext.getString("gcm_defaultSenderId"), paramContext.getString("google_storage_bucket"), paramContext.getString("project_id"));
      AppMethodBeat.o(10597);
    }
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool = false;
    AppMethodBeat.i(10598);
    if (!(paramObject instanceof b))
      AppMethodBeat.o(10598);
    while (true)
    {
      return bool;
      paramObject = (b)paramObject;
      if ((Objects.equal(this.zzs, paramObject.zzs)) && (Objects.equal(this.buI, paramObject.buI)) && (Objects.equal(this.zzt, paramObject.zzt)) && (Objects.equal(this.zzu, paramObject.zzu)) && (Objects.equal(this.buJ, paramObject.buJ)) && (Objects.equal(this.zzw, paramObject.zzw)) && (Objects.equal(this.zzx, paramObject.zzx)))
      {
        bool = true;
        AppMethodBeat.o(10598);
      }
      else
      {
        AppMethodBeat.o(10598);
      }
    }
  }

  public final int hashCode()
  {
    AppMethodBeat.i(10599);
    int i = Objects.hashCode(new Object[] { this.zzs, this.buI, this.zzt, this.zzu, this.buJ, this.zzw, this.zzx });
    AppMethodBeat.o(10599);
    return i;
  }

  public final String toString()
  {
    AppMethodBeat.i(10600);
    String str = Objects.toStringHelper(this).add("applicationId", this.zzs).add("apiKey", this.buI).add("databaseUrl", this.zzt).add("gcmSenderId", this.buJ).add("storageBucket", this.zzw).add("projectId", this.zzx).toString();
    AppMethodBeat.o(10600);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.google.firebase.b
 * JD-Core Version:    0.6.2
 */