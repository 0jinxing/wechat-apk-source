package com.facebook.share.model;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class ShareCameraEffectContent$Builder extends ShareContent.Builder<ShareCameraEffectContent, Builder>
{
  private CameraEffectArguments arguments;
  private String effectId;
  private CameraEffectTextures textures;

  public final ShareCameraEffectContent build()
  {
    AppMethodBeat.i(97397);
    ShareCameraEffectContent localShareCameraEffectContent = new ShareCameraEffectContent(this, null);
    AppMethodBeat.o(97397);
    return localShareCameraEffectContent;
  }

  public final Builder readFrom(ShareCameraEffectContent paramShareCameraEffectContent)
  {
    AppMethodBeat.i(97398);
    if (paramShareCameraEffectContent == null)
    {
      AppMethodBeat.o(97398);
      paramShareCameraEffectContent = this;
    }
    while (true)
    {
      return paramShareCameraEffectContent;
      paramShareCameraEffectContent = ((Builder)super.readFrom(paramShareCameraEffectContent)).setEffectId(this.effectId).setArguments(this.arguments);
      AppMethodBeat.o(97398);
    }
  }

  public final Builder setArguments(CameraEffectArguments paramCameraEffectArguments)
  {
    this.arguments = paramCameraEffectArguments;
    return this;
  }

  public final Builder setEffectId(String paramString)
  {
    this.effectId = paramString;
    return this;
  }

  public final Builder setTextures(CameraEffectTextures paramCameraEffectTextures)
  {
    this.textures = paramCameraEffectTextures;
    return this;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.facebook.share.model.ShareCameraEffectContent.Builder
 * JD-Core Version:    0.6.2
 */