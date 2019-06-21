package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved;
import com.tencent.matrix.trace.core.AppMethodBeat;

@SafeParcelable.Class(creator="SignInConfigurationCreator")
@SafeParcelable.Reserved({1})
public final class SignInConfiguration extends AbstractSafeParcelable
  implements ReflectedParcelable
{
  public static final Parcelable.Creator<SignInConfiguration> CREATOR;

  @SafeParcelable.Field(getter="getConsumerPkgName", id=2)
  private final String zzfe;

  @SafeParcelable.Field(getter="getGoogleConfig", id=5)
  private GoogleSignInOptions zzff;

  static
  {
    AppMethodBeat.i(50406);
    CREATOR = new zzy();
    AppMethodBeat.o(50406);
  }

  @SafeParcelable.Constructor
  public SignInConfiguration(@SafeParcelable.Param(id=2) String paramString, @SafeParcelable.Param(id=5) GoogleSignInOptions paramGoogleSignInOptions)
  {
    AppMethodBeat.i(50402);
    this.zzfe = Preconditions.checkNotEmpty(paramString);
    this.zzff = paramGoogleSignInOptions;
    AppMethodBeat.o(50402);
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool1 = false;
    AppMethodBeat.i(50404);
    if (paramObject == null)
      AppMethodBeat.o(50404);
    while (true)
    {
      return bool1;
      try
      {
        paramObject = (SignInConfiguration)paramObject;
        if (this.zzfe.equals(paramObject.zzfe))
          if (this.zzff == null)
          {
            if (paramObject.zzff != null);
          }
          else
          {
            boolean bool2;
            do
            {
              AppMethodBeat.o(50404);
              bool1 = true;
              break;
              bool2 = this.zzff.equals(paramObject.zzff);
            }
            while (bool2);
          }
        AppMethodBeat.o(50404);
      }
      catch (ClassCastException paramObject)
      {
        AppMethodBeat.o(50404);
      }
    }
  }

  public final int hashCode()
  {
    AppMethodBeat.i(50405);
    int i = new HashAccumulator().addObject(this.zzfe).addObject(this.zzff).hash();
    AppMethodBeat.o(50405);
    return i;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(50403);
    int i = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeString(paramParcel, 2, this.zzfe, false);
    SafeParcelWriter.writeParcelable(paramParcel, 5, this.zzff, paramInt, false);
    SafeParcelWriter.finishObjectHeader(paramParcel, i);
    AppMethodBeat.o(50403);
  }

  public final GoogleSignInOptions zzt()
  {
    return this.zzff;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.google.android.gms.auth.api.signin.internal.SignInConfiguration
 * JD-Core Version:    0.6.2
 */