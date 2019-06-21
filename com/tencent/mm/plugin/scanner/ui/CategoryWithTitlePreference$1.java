package com.tencent.mm.plugin.scanner.ui;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.preference.f;

final class CategoryWithTitlePreference$1
  implements Runnable
{
  CategoryWithTitlePreference$1(CategoryWithTitlePreference paramCategoryWithTitlePreference, Bitmap paramBitmap)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(81000);
    CategoryWithTitlePreference.a(this.qcb).setImageBitmap(this.val$bitmap);
    CategoryWithTitlePreference.a(this.qcb).setVisibility(0);
    if (CategoryWithTitlePreference.b(this.qcb) != null)
      CategoryWithTitlePreference.b(this.qcb).notifyDataSetChanged();
    AppMethodBeat.o(81000);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.ui.CategoryWithTitlePreference.1
 * JD-Core Version:    0.6.2
 */