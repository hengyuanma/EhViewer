/*
 * Copyright 2017 Hippo Seven
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.hippo.ehviewer.component;

/*
 * Created by Hippo on 2/3/2017.
 */

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.hippo.ehviewer.client.data.GalleryInfo;
import com.hippo.ehviewer.component.base.GalleryInfoDetailHolder;

/**
 * Detail {@code ViewHolder} for {@link GalleryListAdapter}.
 */
public class GalleryListDetailHolder extends GalleryInfoDetailHolder<GalleryInfo> {

  private GalleryListDetailHolder(View view) {
    super(view);
  }

  @Override
  public void bind(GalleryInfo info) {
    bindGalleryInfo(info);
  }

  public static GalleryListDetailHolder create(LayoutInflater inflater, ViewGroup container) {
    return new GalleryListDetailHolder(createView(inflater, container));
  }
}
