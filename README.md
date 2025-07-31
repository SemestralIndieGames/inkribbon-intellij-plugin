# 🖋️ InkRibbon — IntelliJ Plugin

> _"A lone typewriter sits quietly in the corner.  
> Its ink ribbon is intact."_  
> — *Resident Evil 2*

---

En medio del caos del código, entre bugs desconocidos y builds que fallan sin razón, hay un lugar seguro.  
**InkRibbon** es tu máquina de escribir. Tu único método de salvación.

Este plugin para IntelliJ IDEA está inspirado en la mítica experiencia de guardado de *Resident Evil 2*.  
En lugar de registrar tu supervivencia frente a zombis, **registra tu progreso como desarrollador**.  
Entradas Markdown. Checkpoints mentales. Reflexiones antes de volver al campo de batalla.

🕯️ **Encendé tu lámpara. Sentate. Escribí. Y guardá.**

---

**InkRibbon** te permite:

- Seleccionar una carpeta donde se almacenarán todas tus entradas.
- Crear archivos `.md` con la fecha del día, como si fueran partidas salvadas.
- Escribir tu bitácora en una interfaz silenciosa y sin distracciones.
- Mantener tu progreso **dentro del plugin**, como si nunca hubieras salido del refugio.

> Porque todo desarrollador necesita su propia **Safe Room**.

---

## ✨ Características

- 🗂️ Selección de carpeta donde se guardarán todas tus bitácoras.
- 📅 Botón para crear automáticamente un archivo Markdown con la fecha actual (`YYYY-MM-DD.md`).
- 📝 Editor de texto integrado dentro de la ToolWindow.
- 💾 Guardado persistente del contenido con un solo clic.
- 🧘‍♂️ Panel simple, limpio, sin distracciones: escribí y volvé al código.

---

## 📸 Captura de pantalla (WIP)

> _Próximamente_

---

## 🚀 Instalación

### Desde IntelliJ IDEA (Marketplace)

1. Abrí **Settings > Plugins**
2. Buscá `InkRibbon`
3. Instalá y reiniciá IntelliJ

### Desde archivo `.zip`

1. Cloná o descargá este repositorio
2. Ejecutá el plugin en modo desarrollo o generá el `.zip` con:
   ```bash
   ./gradlew buildPlugin
   ```
3. En IntelliJ: **Settings > Plugins > Install plugin from disk**

---

## 🗃️ Uso

1. Abrí la ToolWindow "InkRibbon" desde la barra lateral.
2. Seleccioná la carpeta donde querés guardar tus bitácoras (`~/Bitacoras` por ejemplo).
3. Hacé clic en **"Nueva Bitácora"** — se creará un archivo `YYYY-MM-DD.md` en la carpeta elegida.
4. Escribí tu entrada en el editor integrado.
5. Presioná **"Guardar entrada"** y seguí con tu día.

> Las bitácoras se mantienen dentro del panel del plugin, sin abrir archivos externos.

---

## 🧪 Roadmap (Ideas Futuras)

- [ ] Historial de entradas recientes
- [ ] Lista navegable de bitácoras
- [ ] Atajos de teclado
- [ ] Soporte para tags o etiquetas
- [ ] UI temática al estilo Resident Evil (modo oscuro Safe Room)
- [ ] Sincronización opcional vía Git, Dropbox o similar

---

## ❤️ Créditos

> Este plugin es libre y gratuito, pero agradeceríamos que incluyas una referencia visible a **InkRibbon** si lo usás en proyectos públicos o distribuidos.

✨ _Creado con [InkRibbon](https://github.com/SemestralIndieGames/inkribbon-intellij-plugin) por [Semestral Indie Games](https://github.com/SemestralIndieGames)_

---

## 📄 Licencia

Este proyecto está licenciado bajo la licencia MIT.  
Ver el archivo [`LICENSE`](./LICENSE) para más detalles.

---
