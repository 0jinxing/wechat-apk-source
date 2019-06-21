package com.facebook.share.internal;

import com.facebook.share.model.ShareModelBuilder;
import com.tencent.matrix.trace.core.AppMethodBeat;

@Deprecated
public class LikeContent$Builder
  implements ShareModelBuilder<LikeContent, Builder>
{
  private String objectId;
  private String objectType;

  @Deprecated
  public LikeContent build()
  {
    AppMethodBeat.i(97091);
    LikeContent localLikeContent = new LikeContent(this, null);
    AppMethodBeat.o(97091);
    return localLikeContent;
  }

  @Deprecated
  public Builder readFrom(LikeContent paramLikeContent)
  {
    AppMethodBeat.i(97092);
    if (paramLikeContent == null)
    {
      AppMethodBeat.o(97092);
      paramLikeContent = this;
    }
    while (true)
    {
      return paramLikeContent;
      paramLikeContent = setObjectId(paramLikeContent.getObjectId()).setObjectType(paramLikeContent.getObjectType());
      AppMethodBeat.o(97092);
    }
  }

  @Deprecated
  public Builder setObjectId(String paramString)
  {
    this.objectId = paramString;
    return this;
  }

  @Deprecated
  public Builder setObjectType(String paramString)
  {
    this.objectType = paramString;
    return this;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.facebook.share.internal.LikeContent.Builder
 * JD-Core Version:    0.6.2
 */