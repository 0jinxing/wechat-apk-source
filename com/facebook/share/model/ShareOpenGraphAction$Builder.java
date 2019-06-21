package com.facebook.share.model;

import android.os.Parcel;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class ShareOpenGraphAction$Builder extends ShareOpenGraphValueContainer.Builder<ShareOpenGraphAction, Builder>
{
  private static final String ACTION_TYPE_KEY = "og:type";

  public final ShareOpenGraphAction build()
  {
    AppMethodBeat.i(97522);
    ShareOpenGraphAction localShareOpenGraphAction = new ShareOpenGraphAction(this, null);
    AppMethodBeat.o(97522);
    return localShareOpenGraphAction;
  }

  final Builder readFrom(Parcel paramParcel)
  {
    AppMethodBeat.i(97524);
    paramParcel = readFrom((ShareOpenGraphAction)paramParcel.readParcelable(ShareOpenGraphAction.class.getClassLoader()));
    AppMethodBeat.o(97524);
    return paramParcel;
  }

  public final Builder readFrom(ShareOpenGraphAction paramShareOpenGraphAction)
  {
    AppMethodBeat.i(97523);
    if (paramShareOpenGraphAction == null)
    {
      AppMethodBeat.o(97523);
      paramShareOpenGraphAction = this;
    }
    while (true)
    {
      return paramShareOpenGraphAction;
      paramShareOpenGraphAction = ((Builder)super.readFrom(paramShareOpenGraphAction)).setActionType(paramShareOpenGraphAction.getActionType());
      AppMethodBeat.o(97523);
    }
  }

  public final Builder setActionType(String paramString)
  {
    AppMethodBeat.i(97521);
    putString("og:type", paramString);
    AppMethodBeat.o(97521);
    return this;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.facebook.share.model.ShareOpenGraphAction.Builder
 * JD-Core Version:    0.6.2
 */