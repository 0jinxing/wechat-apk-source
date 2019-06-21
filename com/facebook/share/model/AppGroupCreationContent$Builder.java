package com.facebook.share.model;

import com.tencent.matrix.trace.core.AppMethodBeat;

public class AppGroupCreationContent$Builder
  implements ShareModelBuilder<AppGroupCreationContent, Builder>
{
  private String description;
  private String name;
  private AppGroupCreationContent.AppGroupPrivacy privacy;

  public AppGroupCreationContent build()
  {
    AppMethodBeat.i(97327);
    AppGroupCreationContent localAppGroupCreationContent = new AppGroupCreationContent(this, null);
    AppMethodBeat.o(97327);
    return localAppGroupCreationContent;
  }

  public Builder readFrom(AppGroupCreationContent paramAppGroupCreationContent)
  {
    AppMethodBeat.i(97328);
    if (paramAppGroupCreationContent == null)
    {
      AppMethodBeat.o(97328);
      paramAppGroupCreationContent = this;
    }
    while (true)
    {
      return paramAppGroupCreationContent;
      paramAppGroupCreationContent = setName(paramAppGroupCreationContent.getName()).setDescription(paramAppGroupCreationContent.getDescription()).setAppGroupPrivacy(paramAppGroupCreationContent.getAppGroupPrivacy());
      AppMethodBeat.o(97328);
    }
  }

  public Builder setAppGroupPrivacy(AppGroupCreationContent.AppGroupPrivacy paramAppGroupPrivacy)
  {
    this.privacy = paramAppGroupPrivacy;
    return this;
  }

  public Builder setDescription(String paramString)
  {
    this.description = paramString;
    return this;
  }

  public Builder setName(String paramString)
  {
    this.name = paramString;
    return this;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.facebook.share.model.AppGroupCreationContent.Builder
 * JD-Core Version:    0.6.2
 */